package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.data.contohData
import com.example.myapp.model.Gallery
import com.example.myapp.ui.theme.MyAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryScreen(
    galleries: List<Gallery> = contohData.myGalleries,
    modifier: Modifier = Modifier
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 16.dp,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
    ) {
        items(galleries, key = {it.id}){
            val showDialog = remember { mutableStateOf(false) }

            Image(

                painter = painterResource(id = it.photo),
                contentDescription = it.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 10.dp,
                            bottomEnd = 10.dp,
                            bottomStart = 10.dp
                        )
                    )
                    .clickable { showDialog.value = true }
            )
            if (showDialog.value){
                AlertDialog(
                    onDismissRequest = { showDialog.value = false },
                    modifier = Modifier,
                    content = (
                            {
                                Image(painter = painterResource(id = it.photo),
                                    contentDescription = "pop up image", modifier = Modifier .defaultMinSize(300.dp, 300.dp)
                                        .clip(
                                            shape = RoundedCornerShape(
                                                topStart = 10.dp,
                                                topEnd = 10.dp,
                                                bottomEnd = 10.dp,
                                                bottomStart = 10.dp
                                            )
                                        )                                    )
                            }
                            )
                )
            }
        }

    }
}

@Preview
@Composable
private fun GalleryScreenPrev() {
    MyAppTheme {
        GalleryScreen(galleries = contohData.myGalleries)
    }
}