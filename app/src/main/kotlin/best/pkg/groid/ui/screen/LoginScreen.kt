package best.pkg.groid.ui.screen

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import best.pkg.groid.R
import best.pkg.groid.TAG
import coil.compose.AsyncImage

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .border(2.dp, Color.Cyan)
            .padding(5.dp)
            .fillMaxHeight()
            .height(200.dp),
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = "https://hiif.ong/logo.png",
            contentDescription = null,
            modifier = modifier
                .height(100.dp)
                .width(100.dp)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(50.dp)),
        )
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = R.string.username) + ":")
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = R.string.password) + ":")
            }
            Row(
                modifier = modifier
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {
                    Log.d(TAG, "Login: haha")
                }) {
                    Text(text = "登录")
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "注册")
                }
            }
        }
    }
}