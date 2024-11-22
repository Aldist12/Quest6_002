package com.example.navigationwithdata.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigationwithdata.R

@Preview(showBackground = true)
@Composable
fun SplashView() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(R.color.primary)))
    {
        Image(
            painter = painterResource(R.drawable.logoumy),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
    }
    Spacer(modifier = Modifier.padding(16.dp))
    Button(
            onClick = {}
            )
    {
        Text( "Mulai")
    }

}