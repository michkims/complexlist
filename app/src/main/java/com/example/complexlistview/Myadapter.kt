package com.example.complexlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Myadapter(var mcontx:Context,var resources:Int,var items:List<models>):ArrayAdapter<models>(mcontx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater=LayoutInflater.from(mcontx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(R.id.image)
        val titletextview:TextView=view.findViewById(R.id.Tv_maintext)
        val descriptiontextview:TextView=view.findViewById(R.id.Tv_subtext)

        var myitem:models=items[position]
        imageView.setImageDrawable(mcontx.resources.getDrawable(myitem.img))
        titletextview.text=myitem.title
        descriptiontextview.text=myitem.description
        return view

    }
}