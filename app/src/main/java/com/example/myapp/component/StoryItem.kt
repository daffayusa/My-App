package com.example.myapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.R
import com.example.myapp.model.Story
import com.example.myapp.ui.theme.MyAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryItem(
    story: Story,
    modifier: Modifier = Modifier,

) {
    val showDialog = remember { mutableStateOf(false) }
    Image(
        painter = painterResource(id = story.photo),
        contentDescription = "", modifier = Modifier
            .clip(CircleShape)
            .size(80.dp)
            .border(2.dp, Color.Blue, CircleShape)
            .padding(4.dp)
            .clickable { showDialog.value = true }

    )
    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            modifier = Modifier.fillMaxWidth(),
            content = {Image(painter = painterResource(id = story.photo), contentDescription = "pop up image", modifier .size(300.dp))},
            )

    }
}

@Preview
@Composable
private fun StoryItemView() {
    MyAppTheme {
        StoryItem(story = Story(1, R.drawable.mina, "Mina"))
    }
}