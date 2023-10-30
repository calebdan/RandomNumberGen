package co.danjuma.randomnumbergen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.danjuma.randomnumbergen.components.ButtonComponent
import co.danjuma.randomnumbergen.components.TextviewComponent
import co.danjuma.randomnumbergen.data.RandomViewModel
import co.danjuma.randomnumbergen.ui.theme.RandomNumberGenTheme

class MainActivity : ComponentActivity() {
    private val viewModel = RandomViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            RansomNumberApp(viewModel)

        }
    }

}

@Composable
fun RansomNumberApp(viewModel: RandomViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(150.dp)
            .padding(top = 80.dp)
    ) {
        Column {

            TextviewComponent(
            viewModel)
            Spacer(modifier = Modifier.height(60.dp))

            ButtonComponent(viewModel)
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   // RansomNumberApp()
}