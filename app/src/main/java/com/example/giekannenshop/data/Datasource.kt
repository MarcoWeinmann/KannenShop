package com.example.giekannenshop.data

import com.example.giekannenshop.R
import com.example.giekannenshop.data.model.Gießkanne

class Datasource {

    fun loadKanne(): List<Gießkanne> {
        return listOf(
            Gießkanne(
                R.drawable.can1,
                14.99,
                "Kanne1",
                false
            ),
            Gießkanne(
                R.drawable.can2,
                19.99,
                "Kanne2",
                false
            ),
            Gießkanne(
                R.drawable.can3,
                29.99,
                "Kanne3",
                false
            ),
            Gießkanne(
                R.drawable.can4,
                34.99,
                "Kanne4",
                true
            ),
            Gießkanne(
                R.drawable.can5,
                39.99,
                "Kanne5",
                false
            ),
            Gießkanne(
                R.drawable.can6,
                49.99,
                "Kanne6",
                false
            )
        )

    }
}