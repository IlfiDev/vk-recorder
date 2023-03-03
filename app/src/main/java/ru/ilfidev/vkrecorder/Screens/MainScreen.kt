package ru.ilfidev.vkrecorder.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.R
import androidx.compose.foundation.clickable


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AudioCard(){
    Card(modifier = Modifier
        .fillMaxWidth(0.9f)
        .height(80.dp)) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
           Column(
               modifier = Modifier.width(100.dp),
               horizontalAlignment = Alignment.Start
           ) {
               Text("Test Text")
               Text("Test Text 2")
           }
            Row(){

                Text("1.34:")
                Text("2.25")
            }
            Image(painter = painterResource(id = R.drawable.ic_notification_clear_all), contentDescription = null,
            modifier = Modifier.size(20.dp))
        }

    }
}

@Composable
fun recording(){
    Image(painter = painterResource(id = R.drawable.arrow_down_float),
        contentDescription = null,
        modifier = Modifier.clickable {  }

    )
}