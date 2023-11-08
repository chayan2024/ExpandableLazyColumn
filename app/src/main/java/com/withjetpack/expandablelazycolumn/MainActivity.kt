package com.withjetpack.expandablelazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.withjetpack.expandablelazycolumn.model.ExpandableItem
import com.withjetpack.expandablelazycolumn.ui.theme.ExpandableLazyColumnTheme
import com.withjetpack.expandablelazycolumn.viewmodel.ExpandableListViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableLazyColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primary
                ) {
                    val viewModel: ExpandableListViewModel = viewModel()
                    LazyColumn {
                        items(viewModel.items) { item ->
                            ExpandableItem(item) {
                                item.isExpanded = !item.isExpanded
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExpandableLazyColumnTheme {
    }
}