package co.danjuma.randomnumbergen.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import co.danjuma.randomnumbergen.R
import co.danjuma.randomnumbergen.data.RandomViewModel

@Composable
fun TextviewComponent(value: RandomViewModel) {
    Text(
        text = value.randomNumber.value.toString(),

        fontSize = 60.sp,
        color = Color.Black,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center,

        modifier = Modifier.fillMaxWidth()


    )
}

@Composable
fun ButtonComponent(viewModel: RandomViewModel) {
    Button(
        onClick = {
                  viewModel.generateRandomNumber()
        },

        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        contentPadding = PaddingValues()

    ) {

        Text(
            text = stringResource(id = R.string.go),
            color = Color.White
        )
    }
}