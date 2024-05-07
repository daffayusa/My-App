package com.example.myapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.myapp.data.contohData
import com.example.myapp.model.Member
import com.example.myapp.model.Story

@Composable
fun DetailMemberScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    memberId : Int?
) {
    val newMemberList = contohData.member.filter { 
        member -> member.id == memberId  
    }
    Column(
        modifier = modifier
    ) {
        Content(newMemberList = newMemberList)
    }
}

@Composable
private fun Content(
    newMemberList: List<Member>,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier .padding(16.dp)
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newMemberList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newMemberList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text = "(${newMemberList[0].nickname})",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Role : (${newMemberList[0].role})",
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailMemberPrev() {
    Content(newMemberList = contohData.member)
}