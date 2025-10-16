package pro.jsandoval.testtopappbar.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pro.jsandoval.testtopappbar.R
import pro.jsandoval.testtopappbar.ui.theme.TestTopAppBarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun DemoScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("Title goes here") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                ),
            )
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding.calculateBottomPadding()), // this does the trick
        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(240.dp),
                    painter = painterResource(id = R.drawable.top_image_demo),
                    contentDescription = "test image",
                    contentScale = ContentScale.Crop,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "Content Title",
                    style = MaterialTheme.typography.headlineMedium,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                        "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
            items(50) { index ->
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    text = "Item #$index",
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
    }
}

@Preview
@Composable
private fun DemoScreenPreview() {
    TestTopAppBarTheme {
        DemoScreen(modifier = Modifier.fillMaxSize())
    }
}
