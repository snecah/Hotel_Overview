package com.example.core.ui.base.DifUtil

import androidx.recyclerview.widget.DiffUtil
import com.example.core.ui.base.ListItem

class BaseDiffUtilItemCallback:DiffUtil.ItemCallback<ListItem>() {
    override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem.itemId == newItem.itemId
    }

    override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
       return oldItem.equals(newItem)
    }
}