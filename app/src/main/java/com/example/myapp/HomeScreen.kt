package com.example.myapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapp.data.contohData
import com.example.myapp.model.Member
import com.example.myapp.ui.theme.MyAppTheme
import androidx.compose.foundation.lazy.items
import com.example.myapp.component.PersonalItem
import com.example.myapp.component.StoryItem
import com.example.myapp.model.Story
import com.example.myapp.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    member: List<Member> = contohData.member,
    story: List<Story> = contohData.userStory
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        LazyRow(
            contentPadding = PaddingValues(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
        ) {
            items(story, key = {it.id}){
                StoryItem(story = it)
            }
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        ) {
            items(member, key = {it.id}){
                PersonalItem(member = it){ memberId ->
                    navController.navigate(Screen.Detail.route+ "/$memberId")
                }
            }
        }
    }

}

@Preview
@Composable
private fun HomeScreenPrev() {
    MyAppTheme {

    }
}