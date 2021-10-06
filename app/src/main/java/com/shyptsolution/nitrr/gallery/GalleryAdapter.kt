package com.shyptsolution.nitrr.gallery

import android.content.Context
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.shyptsolution.nitrr.R

class GalleryAdapter(gallerylist:ArrayList<GalleryDataModel>):BaseAdapter() {
    var galleryList=gallerylist
    var image:ImageView?=null
    var texxt:TextView?=null
    override fun getCount(): Int {
       return galleryList.size
    }

    override fun getItem(position: Int): Any {
        return galleryList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var inflator=LayoutInflater.from(parent?.context).inflate(R.layout.gallery_ticket,null)
        image=inflator.findViewById(R.id.gallery)
        image?.setImageResource(galleryList[position].image)


        return inflator
    }
}