package anthony.daniel.ermes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route) {

        }
        composable(route = Screen.Main.route) {

        }
    }
}