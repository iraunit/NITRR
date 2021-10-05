package com.shyptsolution.nitrr.department

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shyptsolution.nitrr.R
import org.w3c.dom.Text

class DepartmentAdapter(listofDept:ArrayList<Data>) : RecyclerView.Adapter<DepartmentAdapter.Holder>() {

    var listDept:ArrayList<Data> =listofDept

 inner   class Holder(itemview: View):RecyclerView.ViewHolder(itemview) {
                 var one:TextView
                 var two:TextView
        var image:ImageView
        var layoutbottom:LinearLayout
        var layouttop:LinearLayout=itemview.findViewById(R.id.layouttop)
     init{

          one = itemview.findViewById<TextView>(R.id.departmenttitle)
         two = itemview.findViewById<TextView>(R.id.aboutdepartment)
         image=itemView.findViewById<ImageView>(R.id.departmentimage)
        layoutbottom=itemview.findViewById(R.id.layoutbottom)
     }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentAdapter.Holder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)

        return Holder(view)
    }

    override fun onBindViewHolder(holder: DepartmentAdapter.Holder, position: Int) {
        holder.one.text=listDept[position].name
        holder.two.text=listDept[position].dept
        holder.image.setImageResource(listDept[position].image)

        val isVisible:Boolean=listDept[position].visibilty
        holder.layoutbottom.visibility=if(isVisible) View.VISIBLE else View.GONE

        holder.layouttop.setOnClickListener {
            listDept[position].visibilty=!listDept[position].visibilty
            notifyItemChanged(position)
        }




    }

    override fun getItemCount(): Int {
      return listDept.size
    }
}