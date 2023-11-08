package com.withjetpack.expandablelazycolumn.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.withjetpack.expandablelazycolumn.model.ExpandableItem

class ExpandableListViewModel : ViewModel() {

    val items = mutableStateListOf<ExpandableItem>()

    init {
        items.addAll(
            listOf(
                ExpandableItem("A", "Apple"),
                ExpandableItem("B", "Ball"),
                ExpandableItem("C", "Cat"),
                ExpandableItem("D", "Dog"),
                ExpandableItem("E", "Elephant"),
                // Add more items as needed
            )
        )
    }
}
