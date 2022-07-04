package com.example.giekannenshop.data

import com.example.giekannenshop.R
import com.example.giekannenshop.data.model.Gießkanne

class datasource {

    fun loadKanne():List<Gießkanne>{
    return listOf(
            Gießkanne(
                R.drawable.can1,
            15.00, "Super Kanne", false
            )
    )

    }
}