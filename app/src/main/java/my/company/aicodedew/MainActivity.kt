package my.company.aicodedew

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import my.company.aicodedew.ui.navigation.AppNavigation
import my.company.aicodedew.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComposeApplicationTheme {
                AppNavigation()
            }
        }
    }
}
