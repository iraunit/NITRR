package com.shyptsolution.nitrr

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_admissionfragment.*
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), OnMapReadyCallback {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var VIdeoid1="L0WGZSiOZsM"
    var youtubeapikey="AIzaSyCMdY2P0rE0c9-WIDw2a-GoybSOxI-RRpI"
    lateinit var youtubeplayer:YouTubePlayerView
    lateinit var ytplayerinit:YouTubePlayer.OnInitializedListener

    private lateinit var googleMap: GoogleMap
    lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


        fun onMapReady(googleMap: GoogleMap) {
            val raipur = LatLng(48.8583, 2.2923)
            googleMap.addMarker(
                MarkerOptions()
                    .position(raipur)
                    .title("NIT Raipur")
            )
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(raipur))
        }

    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        mapView.onCreate(savedInstanceState)
//        mapView.onResume()
//        mapView.getMapAsync(this)
//    }
//


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var imagepicaso: ImageView? = null
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        imagepicaso = view.findViewById(R.id.maingate)
        var supprtmap: SupportMapFragment

//        Picasso.get().load("https://lh3.googleusercontent.com/proxy/oQfOb0z1ueAM6CRot8re6TKevN20GJoQ3KPZzoTaFGPXhqbh-BJgBI9qBdXfRb8H_8Nm-zoPbKDO6-Cmu8n1tO_zUQXErWn2r9MDm1O3TK_18FkRRdJ_R3t5YeWWWD1RVQ").into(imagepicaso)
        mapView = view.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        mapView.getMapAsync(this)
        val url = "http://www.nitrr.ac.in/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)

        var nitrr=view.findViewById<TextView>(R.id.nitrr)
        nitrr.setOnClickListener {
            startActivity(i)
        }
//        youtubeplayer=view.findViewById<YouTubePlayerView>(R.id.youtubeplaerarea)
//        ytplayerinit=object : YouTubePlayer.OnInitializedListener{
//            override fun onInitializationSuccess(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubePlayer?,
//                p2: Boolean
//            ) {
//                p1?.loadVideo(VIdeoid1)
//                youtubeplayer.initialize(youtubeapikey,ytplayerinit)
//            }
//
//            override fun onInitializationFailure(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubeInitializationResult?
//            ) {
//                Toast.makeText(activity,"Please Connect to the Internet",Toast.LENGTH_LONG).show()
//            }
//
//        }


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onMapReady(map: GoogleMap) {
        map?.let {
            googleMap=it
        }
        val sydney = LatLng(21.245520, 81.642050)
        googleMap.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("NIT Raipur CSE Department")
        )
        var zoomlevel=10.0f
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,zoomlevel))
//    }


    }


}

