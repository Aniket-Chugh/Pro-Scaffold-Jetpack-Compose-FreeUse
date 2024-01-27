package com.example.scaffoldappjetpack

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarView(title: String, imageVector: ImageVector){

TopAppBar(


    title = {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue

        )
    },
    navigationIcon = {
                     Icon(imageVector = imageVector, contentDescription = null , modifier = Modifier
                         .padding(12.dp)
                         .clickable {
                             // TODO Auto-generated
                         })
    },
    modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
        .clip(CutCornerShape(12.dp))

,     colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Yellow)
, actions = {
    Icon(imageVector = Icons.Default.Clear, contentDescription = null , modifier = Modifier.padding(end = 12.dp) .clickable {

    } )
    }

    )
}



