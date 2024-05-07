package com.example.myapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.R
import com.example.myapp.data.contohData.album
import com.example.myapp.model.Album
import com.example.myapp.navigation.Screen
import com.example.myapp.ui.theme.MyAppTheme

@Composable
fun AlbumItem(
    albums : Album,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
            .fillMaxWidth()
            .shadow(
                elevation = 1.dp,
                spotColor = Color.Black,
                )

    ){
        Image(
            painter = painterResource(id = albums.photo),
            contentDescription = albums.name,
            modifier = Modifier.fillMaxWidth() .padding(start = 2.dp, top = 2.dp, end = 2.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = albums.name,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier .fillMaxWidth() .padding(start = 2.dp,  end = 2.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = albums.release,
            textAlign = TextAlign.Left,
            modifier = Modifier .fillMaxWidth() .padding(start = 2.dp,  end = 2.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = albums.group,
            textAlign = TextAlign.Left,
            modifier = Modifier .fillMaxWidth() .padding(start = 2.dp,  end = 2.dp)
        )
    }


}

@Preview(showBackground = true)
@Composable
private fun AlbumItemPrev() {
    MyAppTheme {
        AlbumItem(albums = Album(
                1,
                "THE STORY BEGINS",
                "2015-10-20",
                R.drawable.twice_album_1,
                "TWICE"
            )
        )
    }
}