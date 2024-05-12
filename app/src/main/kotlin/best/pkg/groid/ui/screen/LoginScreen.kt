package best.pkg.groid.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import best.pkg.groid.R
import best.pkg.groid.ui.component.spacer.HeightSpacer
import best.pkg.groid.ui.component.spacer.WidthSpacer
import best.pkg.groid.ui.theme.h1
import best.pkg.groid.ui.theme.smileySansFamily
import coil.compose.AsyncImage

@Preview(showBackground = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = modifier
            .fillMaxHeight()
            .height(200.dp)
            .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.Crop),
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
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TextField(
                value = username,
                onValueChange = { username = it},
                placeholder = {
                    Text(
                        text = "请输入用户名",
                        style = h1,
                        color = Color.Gray
                    )
                }
            )
            HeightSpacer(value = 10.dp)
            TextField(
                value = password,
                onValueChange = { password = it},
                placeholder = {
                    Text(
                        text = "请输入密码",
                        style = h1,
                        color = Color.Gray
                    )
                }
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {
                }) {
                    Text(text = stringResource(id = R.string.login), fontFamily = smileySansFamily)
                }
                WidthSpacer(value = 20.dp)
                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.register), fontFamily = smileySansFamily)
                }
            }
        }
    }
}