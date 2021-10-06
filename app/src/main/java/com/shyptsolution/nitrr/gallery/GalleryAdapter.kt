package com.shyptsolution.nitrr.gallery

import android.content.Context
import android.content.Intent
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.shyptsolution.nitrr.R
import kotlinx.android.synthetic.main.gallery_ticket.view.*

class GalleryAdapter(gallerylist:ArrayList<GalleryDataModel>):BaseAdapter() {
    var galleryList=gallerylist
    var image:ImageView?=null
    var gallerylayout:LinearLayout?=null
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
        var context=parent?.context
       inflator.galleryimage.setImageResource(galleryList[position].image)
        inflator.gallerylayout?.setOnClickListener {


            var intent=Intent(context,PhotoActivity::class.java)
            intent.putExtra("image",galleryList[position]!!.image)
            context?.startActivity(intent)
        }





        return inflator
    }
}