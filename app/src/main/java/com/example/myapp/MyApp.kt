package com.example.myapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapp.component.shareItem
import com.example.myapp.navigation.NavigationItem
import com.example.myapp.navigation.Screen
import com.example.myapp.ui.theme.MyAppTheme
import okhttp3.Route

@SuppressLint("RememberReturnType")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(
   modifier: Modifier = Modifier,
   navController: NavHostController = rememberNavController()
) {
   val context = LocalContext.current
   val currentRoute by navController.currentBackStackEntryAsState()

   val actionBarTitle = TitleTopAppBar(context = context, route = currentRoute?.destination?.route)



   Scaffold(
      topBar = {


         TopAppBar(
            title = actionBarTitle,
            navigationIcon = {
               IconButton(onClick = { navController.navigateUp() }) {
                  Icon(
                     imageVector = Icons.Filled.ArrowBack,
                     contentDescription = "Back"
                  )
               }
            },
            actions = {
               IconButton(onClick = { shareItem(context) }) {
                  Icon(
                     imageVector = Icons.Default.Share,
                     contentDescription = stringResource(id = R.string.menu_share)
                  )
               }
            }
         )
      },
      bottomBar = {
         BottomBar(navController)

      },
      modifier = modifier
   ) { contentPadding ->
      NavHost(navController = navController, startDestination = Screen.Home.route, modifier.padding(contentPadding)) {
         composable(Screen.Home.route) {
            HomeScreen(navController)
         }
         composable(Screen.Gallery.route) {
            GalleryScreen()
         }
         composable(Screen.Album.route) {
            AlbumScreen()
         }
         composable(
            Screen.Detail.route + "/{memberId}",
            arguments = listOf(navArgument("memberId") { type = NavType.IntType })
         ) { navBackStackEntry ->
            DetailMemberScreen(navController = navController, memberId = navBackStackEntry.arguments?.getInt("memberId"))
         }
         composable(Screen.About.route){
            AboutScreen()
         }
      }
   }
}

@Composable
fun BottomBar(
   navController: NavHostController = rememberNavController(),
   modifier: Modifier = Modifier
) {
   NavigationBar(
      modifier = modifier
   ) {
      val navBackStackEntry by navController.currentBackStackEntryAsState()
      val currentRoute = navBackStackEntry?.destination?.route

      val navigationItem = listOf(
         NavigationItem(
            title = stringResource(id = R.string.menu_home),
            icon = Icons.Default.Home,
            screen = Screen.Home
         ),
         NavigationItem(
            title = stringResource(id = R.string.menu_album),
            icon = Icons.Default.Topic,
            screen = Screen.Album
         ),
         NavigationItem(
            title = stringResource(id = R.string.menu_gallery),
            icon = Icons.Default.BrowseGallery,
            screen = Screen.Gallery
         ),
         NavigationItem(
            title = stringResource(id = R.string.about),
            icon = Icons.Default.Person,
            screen = Screen.About
         )

         )
      navigationItem.map { item ->
         NavigationBarItem(selected = currentRoute == item.screen.route,
            onClick = {
               navController.navigate(item.screen.route) {
                  popUpTo(navController.graph.findStartDestination().id) {
                     saveState = true
                  }
                  restoreState = true
                  launchSingleTop = true
               }
            }, icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
            label = { Text(text = item.title) })
      }
   }
}

@Composable
fun TitleTopAppBar(
   context: Context,
   route: String?

): @Composable () -> Unit {
   return {
      val title = when (route) {
         "home" -> context.getString(R.string.menu_home)
         "gallery" -> context.getString(R.string.menu_gallery)
         "album" -> context.getString(R.string.menu_album)
         "about" -> context.getString(R.string.about)
         // Add other screens and their corresponding titles here
         else -> "Detail" // Default title
      }
      Text(text = title)
   }
}

@Preview
@Composable
private fun MyAppPrev() {
   MyAppTheme {
      MyApp()
   }
}