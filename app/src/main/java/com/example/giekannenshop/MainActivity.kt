package com.example.giekannenshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.a25c_liveapp.adapter.Item_Adapter
import com.example.giekannenshop.data.Datasource
import com.example.giekannenshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val fans = Datasource().loadKanne()

        binding.recyclerKannen.layoutManager = LinearLayoutManager(this)

        binding.recyclerKannen.adapter = Item_Adapter(this, fans)

        binding.recyclerKannen.setHasFixedSize(true)

        // der SnapHelper sorgt dafür dass die RecyclerView pro Item einrastet
        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.recyclerKannen)
    }
}
