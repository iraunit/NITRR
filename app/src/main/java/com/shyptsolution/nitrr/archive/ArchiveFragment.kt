package com.shyptsolution.nitrr.archive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.shyptsolution.nitrr.R
import com.squareup.picasso.Picasso

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ArchiveFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArchiveFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        var view:View=inflater.inflate(R.layout.fragment_archive, container, false)
        var libraryimage:ImageView=view.findViewById(R.id.libraryimage)
        var hostelimage:ImageView=view.findViewById(R.id.hostel)
        var guestimage:ImageView=view.findViewById(R.id.guesthouse)
        var estate:ImageView=view.findViewById(R.id.estateoffice)
        var sportsimage:ImageView=view.findViewById(R.id.sports)
        var dispensary:ImageView=view.findViewById(R.id.dispensary)
        var sportsimage1:ImageView=view.findViewById(R.id.sports1)
        var sportsimage2:ImageView=view.findViewById(R.id.sports2)

        Picasso.get().load("https://scontent.fpat2-1.fna.fbcdn.net/v/t1.6435-9/38758751_268681270528640_942611739399159808_n.jpg?_nc_cat=106&ccb=1-5&_nc_sid=cdbe9c&_nc_ohc=ly3JDEE0yicAX8VroEr&tn=lEWECTTT51wt7IBl&_nc_ht=scontent.fpat2-1.fna&oh=0652a51a132075f488407a6a0204dc9f&oe=61851093").into(libraryimage)
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/9/93/NIT%2C_Raipur_Campus_%2C_H_hostel.png").into(hostelimage)
        Picasso.get().load("https://lh3.googleusercontent.com/proxy/MCNK-_Z4nIRHFr1BYSSf3Az2XY0RSmUPQRKl38lSWge8HR_n5vN1tuVeTr07ImIxk7CMM0vWP1LEAeTAdu9pLffMgaXoFNPq-5Hq3TnY5ld6mFWcyQ").into(guestimage)
        Picasso.get().load("https://pbs.twimg.com/media/EiHYSmFXYAEEIXo.jpg").into(estate)
        Picasso.get().load("https://scontent.fpat2-1.fna.fbcdn.net/v/t1.6435-9/80092317_451454052199542_3655764875457593344_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=8bfeb9&_nc_ohc=kSwmHnnwzVMAX8IxYvU&_nc_ht=scontent.fpat2-1.fna&oh=46d2fa2f561e9b0e968bd7ed4661b0af&oe=618402D6").into(sportsimage)
        Picasso.get().load("https://lh5.googleusercontent.com/p/AF1QipMbbFAYg4rSif0TkLzmVKC0X5OPMO4-pRbSaYxU=w1080-k-no").into(dispensary)
        Picasso.get().load("http://www.nitrr.ac.in/img/23.jpg").into(sportsimage1)
        Picasso.get().load("http://www.nitrr.ac.in/img/22.jpg").into(sportsimage2)



        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ArchiveFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ArchiveFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}