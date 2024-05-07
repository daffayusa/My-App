package com.example.myapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.component.AlbumItem
import com.example.myapp.data.contohData
import com.example.myapp.model.Album
import com.example.myapp.ui.theme.MyAppTheme

@Composable
fun AlbumScreen(
    albums : List<Album> = contohData.album,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(140.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(albums, key = {it.id}){
            AlbumItem(albums = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AlbumScreenPrev() {
    MyAppTheme {
        AlbumScreen(albums = contohData.album)
    }
    
}