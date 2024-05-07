package com.example.myapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.R
import com.example.myapp.model.Member
import com.example.myapp.ui.theme.MyAppTheme

@Composable
fun PersonalItem(
    member: Member,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth() .clickable {
            onItemClicked(member.id)
        }
    ){
        Image(painter = painterResource(id = member.photo), contentDescription = member.nickname, contentScale = ContentScale.Crop,
            modifier = Modifier .size(80.dp) .clip(CircleShape))
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = member.nickname, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = "Member of " + member.group, color = MaterialTheme.colorScheme.primary)
            }
        }
    }

}

@Preview
@Composable
private fun PersonalItemPrev() {
    MyAppTheme {
        PersonalItem(member = Member(1,"Myoui Mina", "Mina", "", "", R.drawable.mina_profile, "Twice"),
            onItemClicked = {
                memberId->
                println("Member Id : $memberId")
            })
    }
}