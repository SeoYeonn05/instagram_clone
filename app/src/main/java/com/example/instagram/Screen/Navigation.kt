package com.example.instagram.Screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.instagram.R
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun BottomNavigation(navController: NavHostController){
    val items = listOf<BottomNavItem>(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Shorts,
        BottomNavItem.Shopping,
        BottomNavItem.Account
    )
    //val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ""){

    }
}

// 바텀 네비로 이동할 item을 위한 클래스
sealed class BottomNavItem(
    val title: Int, val icon: Int, val screenRoute: String
) {
    object Home : BottomNavItem(R.string.home, R.drawable.ic_home, HOME)
    object Search : BottomNavItem(R.string.search, R.drawable.ic_search, SEARCH)
    object Shorts : BottomNavItem(R.string.shorts, R.drawable.ic_favorite, SHORTS)
    object Shopping : BottomNavItem(R.string.shopping, R.drawable.ic_favorite, SHOPPING)
    object Account : BottomNavItem(R.string.account, R.drawable.ic_home, ACCOUNT)
}

// 빈 컨테이너에서 어떤 화면으로 교체시킬지 관장하는 함수
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute){
        composable(BottomNavItem.Home.screenRoute){

        }
        composable(BottomNavItem.Search.screenRoute){

        }
        composable(BottomNavItem.Shorts.screenRoute){

        }
        composable(BottomNavItem.Shopping.screenRoute){

        }
        composable(BottomNavItem.Account.screenRoute){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {

    }
}