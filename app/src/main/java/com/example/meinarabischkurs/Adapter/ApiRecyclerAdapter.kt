package com.example.meinarabischkurs.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meinarabischkurs.R

class ApiRecyclerAdapter(Item: ArrayList<String>) : RecyclerView.Adapter<ApiRecyclerAdapter.ViewHolder>() {

    private var Item : ArrayList<String>
    init {
        this.Item = Item
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiRecyclerAdapter.ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.vokabel_listitem, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bezeichnung.setText(Item.get(position))
        holder.Prozentsatz.setText(Item.get(position))

    }

    override fun getItemCount(): Int {
        return Item.size

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var Bezeichnung : TextView = itemView.findViewById(R.id.Bezeichnung)
        var Prozentsatz : TextView = itemView.findViewById(R.id.Prozentsatz)



    }




}