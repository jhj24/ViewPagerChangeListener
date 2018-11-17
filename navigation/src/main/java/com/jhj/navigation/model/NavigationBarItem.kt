package com.jhj.navigation.model

import android.widget.ImageView
import android.widget.TextView

data class NavigationBarItem(
        var textViewDefault: TextView? = null,
        var textViewSelected: TextView? = null,
        var imageViewDefault: ImageView? = null
)