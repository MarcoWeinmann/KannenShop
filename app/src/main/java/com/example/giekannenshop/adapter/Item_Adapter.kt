package com.example.a25c_liveapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.giekannenshop.R
import com.example.giekannenshop.data.model.Gießkanne
import com.example.giekannenshop.databinding.ListItemBinding

// diesmal benötigt der Adapter den Context um auf die ColorResources zuzugreifen
class Item_Adapter(
    private val context: Context,
    private val dataset: List<Gießkanne>
) : RecyclerView.Adapter<Item_Adapter.ItemViewHolder>() {

    // der ViewHolder kann über die DatabBinding Variable auf alle Layoutelemente zugreifen
    class ItemViewHolder(val binding: ListItemBinding ) : RecyclerView.ViewHolder(binding.root)

    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        // und in einem ViewHolder zurückgegeben
        return ItemViewHolder(binding)
    }

    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // der aktuelle Fan wird von der Liste geladen
        val item = dataset[position]

        holder.binding.imageView.setImageResource(item.pictureResource)
        holder.binding.textViewName.text = item.name
        holder.binding.textViewPreis.text = "€${item.preis}"

        if (item.sale) {
            holder.binding.textViewSale.visibility = View.VISIBLE
            holder.binding.textViewPreis.setTextColor(ContextCompat.getColor(context, R.color.secondaryLightColor))
            holder.binding.textViewPreis.textSize = 24F
        } else {
            holder.binding.textViewSale.visibility = View.GONE
            holder.binding.textViewPreis.setTextColor(ContextCompat.getColor(context, R.color.black))
            holder.binding.textViewPreis.textSize = 20F
        }
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}
