package com.iessanalberto.dam2.gerardo.citaspelu.navigation

sealed class AppScreens (val route: String){
    object LogoScreen: AppScreens(route = "logo_screen")
    object CitasPeluScreen: AppScreens(route = "citas_pelu_screen")
    object NuevaCitaScreen: AppScreens(route = "nueva_cita_screen")
    object EditDeleteCitaScreen: AppScreens(route = "edit_delete_cita_screen")

}