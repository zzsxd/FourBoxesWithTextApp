package com.example.fourboxeswithtextapp

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.fourboxeswithtextapp.ui.theme.FourBoxesWithTextAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FourBoxesWithTextAppTheme {

            }
        }
    }
}

@Composable
fun FirstArticle(firstNameArticle: String, firstHalfArticle: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFEADDFF))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
            Text(
                text = firstNameArticle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom=16.dp)
            )
            Text(
                text = firstHalfArticle,
            )
        }
        )
    }
@Composable
fun SecondArticle(secondNameArticle: String, secondHalfArticle: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFD0BCFF))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                Text(
                    text = secondNameArticle,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom=16.dp)
                )
                Text(
                    text = secondHalfArticle,
                )
            }
        )
    }
@Composable
fun ThreeArticle(threeNameArticle: String, threeHalfArticle: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFB69DF8))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                Text(
                    text = threeNameArticle,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom=16.dp)
                )
                Text(
                    text = threeHalfArticle,
                )
            }
        )
    }
@Composable
fun FourArticle(fourNameArticle: String, fourHalfArticle: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFF6EDFF))
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                Text(
                    text = fourNameArticle,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom=16.dp)
                )
                Text(
                    text = fourHalfArticle,
                )
            }
        )
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppPreview() {
    FourBoxesWithTextAppTheme {
        Column(modifier = Modifier
            .fillMaxSize()) {
            Row(modifier = Modifier.weight(1f)) {
                FirstArticle(
                    firstNameArticle = stringResource(R.string.first_article_name),
                    firstHalfArticle = stringResource(R.string.first_article_main),
                    modifier = Modifier.weight(1f)
                )
                SecondArticle(
                    secondNameArticle = stringResource(R.string.second_article_name),
                    secondHalfArticle = stringResource(R.string.second_article_main),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                ThreeArticle(
                    threeNameArticle = stringResource(R.string.three_name_article),
                    threeHalfArticle = stringResource(R.string.three_main_article),
                    modifier = Modifier.weight(1f)
                )
                FourArticle(
                    fourNameArticle = stringResource(R.string.four_name_article),
                    fourHalfArticle = stringResource(R.string.four_main_article),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}