package com.example.bloomcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.bloomcompose.R
import com.example.bloomcompose.components.BottomNavBar
import com.example.bloomcompose.components.CustomInput
import com.example.bloomcompose.components.HorizontalCardList
import com.example.bloomcompose.components.VerticalCardList
import com.example.bloomcompose.data.ListCardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                CustomInput("Search", R.drawable.round_search_24)
            }
        },
        bottomBar = { BottomNavBar() }
    ) {
        Column(modifier = Modifier.padding(it)) {
            HorizontalCardList(getDataForHorizontalCards())
            VerticalCardList(cardItems = getDataForVerticalCardList())
        }
    }
}

private fun getDataForHorizontalCards(): List<ListCardItem> {
    return listOf(
        ListCardItem(
            resId = R.drawable.pexels_quang_nguyen_vinh_2132227,
            caption = "Desert chic"
        ),
        ListCardItem(
            resId = R.drawable.pexels_katarzyna_modrzejewska_1400375,
            caption = "Tiny terrariums"
        ),
        ListCardItem(
            resId = R.drawable.pexels_volkan_vardar_5699665,
            caption = "Jungle vibes"
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208086,
            caption = "Easy care"
        ),
        ListCardItem(
            resId = R.drawable.pexels_sid_maia_3511755,
            caption = "Statements"
        ),
    )
}

private fun getDataForVerticalCardList(): List<ListCardItem> {
    return listOf(
        ListCardItem(
            resId = R.drawable.pexels_huy_phan_3097770,
            caption = "Monstera"
        ),
        ListCardItem(
            resId = R.drawable.pexels_karolina_grabowska_4751978,
            caption = "Aglaonema"
        ),
        ListCardItem(
            resId = R.drawable.pexels_melvin_vito_4425201,
            caption = "Peace lily"
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208087,
            caption = "Fiddle leaf tree"
        ),
        ListCardItem(
            resId = R.drawable.pexels_fabian_stroobants_2123482,
            caption = "Snake plant"
        ),
        ListCardItem(
            resId = R.drawable.pexels_faraz_ahmad_1084199,
            caption = "Pothos"
        ),
    )
}