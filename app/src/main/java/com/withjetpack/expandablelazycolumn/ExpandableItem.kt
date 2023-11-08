package com.withjetpack.expandablelazycolumn

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.withjetpack.expandablelazycolumn.model.ExpandableItem
@Composable
fun ExpandableItem(
    item: ExpandableItem,
    onExpandToggle: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = item.title, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))

        // Handle text visibility based on the expanded state
        if (item.isExpanded) {
            Text(text = item.content, maxLines = Int.MAX_VALUE)
        } else {
            Text(text = item.content, maxLines = 2)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Use an Icon to toggle the expand state
        Icon(
            imageVector = if (item.isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
            contentDescription = null,
            modifier = Modifier.clickable {
                onExpandToggle()
            }
        )
    }
}


