package com.example.questbasiccomposable_133

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_133.ui.theme.QuestBasicComposable_133Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_133Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Login", style = TextStyle(fontSize = 50.sp,
            fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Text(text = "Ini adalah halaman Login", style = TextStyle(fontSize = 20.sp))
        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = Modifier.padding(top = 10.dp).padding(bottom = 10.dp).size(250.dp)
        )

        Text(text = "Nama", style = TextStyle(fontSize = 20.sp))
        Text(text =  "Daffa Putradika Pratama", style = TextStyle(fontSize = 30.sp,
            ))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_133Theme {
        BasicLayout()
    }
}