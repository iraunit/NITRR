package com.shyptsolution.nitrr.department

import android.content.Context
import android.content.Intent
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.shyptsolution.nitrr.HomeFragment
import com.shyptsolution.nitrr.R
import com.shyptsolution.nitrr.faculties.Wholeinfo
import com.shyptsolution.nitrr.gallery.PhotoActivity
import com.squareup.picasso.Picasso

class DepartmentAdapter(listofDept:ArrayList<Data>) : RecyclerView.Adapter<DepartmentAdapter.Holder>() {

    var listDept:ArrayList<Data> =listofDept
    var homefragment=HomeFragment()
    var thisfragment=Department()
    lateinit var context: Context
 inner   class Holder(itemview: View):RecyclerView.ViewHolder(itemview) {
                 var one:TextView
                 var two:TextView
                 var three:TextView
                 var four:TextView
                 var five:TextView
                 var button:Button
        var image:ImageView
        var layoutbottom:LinearLayout
        var layouttop:LinearLayout=itemview.findViewById(R.id.layouttop)

     init{

          one = itemview.findViewById<TextView>(R.id.departmenttitle)
         two = itemview.findViewById<TextView>(R.id.aboutdepartment)
         three=itemview.findViewById(R.id.established)
         four=itemview.findViewById(R.id.intake)
         five=itemview.findViewById(R.id.degree)
         image=itemView.findViewById<ImageView>(R.id.departmentimage)
        layoutbottom=itemview.findViewById(R.id.layoutbottom)
        button=itemview.findViewById(R.id.formore)
     }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentAdapter.Holder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        context=parent.context

        return Holder(view)
    }

    override fun onBindViewHolder(holder: DepartmentAdapter.Holder, position: Int) {
        holder.one.text=listDept[position].name
        holder.two.text=listDept[position].dept
        var url=listDept[position].image
        var imageurl:ImageView=holder.image
        holder.three.text=listDept[position].established
        holder.four.text=listDept[position].intake
        holder.five.text=listDept[position].degree
        Picasso.get().load(url).into(imageurl)


        val isVisible:Boolean=listDept[position].visibilty
        holder.layoutbottom.visibility=if(isVisible) View.VISIBLE else View.GONE

        holder.layouttop.setOnClickListener {
            listDept[position].visibilty=!listDept[position].visibilty
            notifyItemChanged(position)
        }
        holder.button.setOnClickListener {
            var intent=Intent(context,Wholeinfo::class.java)
            intent.putExtra("namee",listDept[position].name)
            intent.putExtra("dept",listDept[position].dept)
            intent.putExtra("vision",listDept[position].vision)
            intent.putExtra("mission",listDept[position].mission)
            intent.putExtra("HOD",listDept[position].HOD)
            intent.putExtra("fac1",listDept[position].fac1)
            intent.putExtra("fac2",listDept[position].fac2)
            intent.putExtra("fac3",listDept[position].fac3)
            intent.putExtra("staff1",listDept[position].staff1)
            intent.putExtra("staff2",listDept[position].staff2)
            intent.putExtra("image",listDept[position].image)

            context?.startActivity(intent)
        }





    }

    override fun getItemCount(): Int {
      return listDept.size
    }

//    fun replaceFragment(someFragment: Fragment?) {
//        val transaction: FragmentTransaction = FragmentManager!!.beginTransction()
//        transaction.replace(R.id.departmentfrag,homefragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }


}