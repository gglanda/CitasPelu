package com.iessanalberto.dam2.gerardo.citaspelu.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.iessanalberto.dam2.gerardo.citaspelu.screens.LogoScreen
import com.iessanalberto.dam2.gerardo.citaspelu.screens.CitasPeluScreen
import com.iessanalberto.dam2.gerardo.citaspelu.screens.EditDeleteCitaScreen
import com.iessanalberto.dam2.gerardo.citaspelu.screens.NuevaCitaScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
   NavHost( navController = navController,startDestination = AppScreens.LogoScreen.route
    ) {
        composable(route = AppScreens.LogoScreen.route) { LogoScreen(navController = navController) }
        composable(route = AppScreens.CitasPeluScreen.route) {CitasPeluScreen( navController = navController) }
        composable(route = AppScreens.NuevaCitaScreen.route) {NuevaCitaScreen( navController = navController)}
        composable(
            route = AppScreens.EditDeleteCitaScreen.route + "/{id}",
            arguments = listOf(navArgument(name = "id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: -1

            AppScreens.EditDeleteCitaScreen(navController = navController, id = id)
        }
    }
}