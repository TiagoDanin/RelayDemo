package com.tiagodanin.apps.relaydemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tiagodanin.apps.relaydemo.contact.Contact
import com.tiagodanin.apps.relaydemo.ui.theme.RelayDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RelayDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListContacts()
                }
            }
        }
    }
}

@Composable
fun ListContacts() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(10.dp)
    ) {
        Contact(title = "Tiago", onClick = {})
        Contact(title = "Danin", onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RelayDemoTheme {
        ListContacts()
    }
}