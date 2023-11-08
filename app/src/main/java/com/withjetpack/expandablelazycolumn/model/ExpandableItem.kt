package com.withjetpack.expandablelazycolumn.model

data class ExpandableItem(val title: String, val content: String, var isExpanded: Boolean = false)
