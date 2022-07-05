package com.example.giekannenshop.data

import com.example.giekannenshop.R
import com.example.giekannenshop.data.model.Gießkanne

class Datasource {

    fun loadKanne(): List<Gießkanne> {
        return listOf(
            Gießkanne(
                R.drawable.can1,
                14.99,
                "Gießkanne Plastik Blau",
                false
            ),
            Gießkanne(
                R.drawable.can2,
                17.99,
                "Gießkanne Plastik Grün",
                false
            ),
            Gießkanne(
                R.drawable.can3,
                29.99,
                "Gießkanne Metall Rot",
                false
            ),
            Gießkanne(
                R.drawable.can4,
                26.89,
                "Gießkanne Metall Grau",
                true
            ),
            Gießkanne(
                R.drawable.can5,
                39.99,
                "Gießkanne Chrom",
                false
            ),
            Gießkanne(
                R.drawable.can6,
                21.59,
                "Gießkanne Plastik Kinder",
                true
            ),
            Gießkanne(
                R.drawable.flamingocan,
                24.99,
                "Flamingo Gießkanne",
                false
            ),
            Gießkanne(
                R.drawable.goldcan,
                1229.89,
                "Gießkanne Gold",
                true
            ),
            Gießkanne(
                R.drawable.gartenschlauch,
                27.49,
                "Gartenschlauch 30m",
                true
            )
        )

    }
}