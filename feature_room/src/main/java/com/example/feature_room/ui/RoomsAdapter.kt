package com.example.feature_room.ui

import com.example.core.ui.base.DifUtil.BaseDiffUtilItemCallback
import com.example.core.ui.base.ListItem
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class RoomsAdapter(onChoiceButtonClicked: ()-> Unit):AsyncListDifferDelegationAdapter<ListItem>(BaseDiffUtilItemCallback()) {

    init {
        delegatesManager.addDelegate(RoomsScreenDelegates.roomsDelegate(onChoiceButtonClicked))
    }
}