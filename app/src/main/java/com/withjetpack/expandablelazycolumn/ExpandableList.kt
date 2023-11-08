package com.withjetpack.expandablelazycolumn

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.withjetpack.expandablelazycolumn.model.ExpandableItem
import com.withjetpack.expandablelazycolumn.viewmodel.ExpandableListViewModel

@Composable
fun ExpandableList(viewModel: ExpandableListViewModel) {
    LazyColumn {
        items(viewModel.items) { item ->
            ExpandableItem(item) {
                item.isExpanded = !item.isExpanded
            }
        }
    }
}
