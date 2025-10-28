package id.antasari.p5datasave_230104040122.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import id.antasari.p5datasave_230104040122.ui.theme.screens.AboutScreen
import id.antasari.p5datasave_230104040122.ui.theme.screens.FilesScreen
import id.antasari.p5datasave_230104040122.ui.theme.screens.HomeScreen
import id.antasari.p5datasave_230104040122.ui.theme.screens.SharedPrefsScreen

@Composable
fun NavGraph(
    nav: NavHostController,
    pad: PaddingValues,
    onDarkChanged: (Boolean) -> Unit // callback dari MainActivity untuk sinkron tema
) {
    NavHost(
        navController = nav,
        startDestination = Dest.startRoute,
        modifier = Modifier.padding(pad)
    ) {
        composable(Dest.Home.route) { HomeScreen(nav) }
        composable(Dest.SP.route) { SharedPrefsScreen(onDarkChanged = onDarkChanged) }
        composable(Dest.Files.route) { FilesScreen() }
        composable(Dest.About.route) { AboutScreen() }
    }
}