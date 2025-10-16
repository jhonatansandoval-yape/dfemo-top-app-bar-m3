package pro.jsandoval.testtopappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pro.jsandoval.testtopappbar.screen.DemoScreen
import pro.jsandoval.testtopappbar.ui.theme.TestTopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestTopAppBarTheme {
                DemoScreen()
            }
        }
    }
}
