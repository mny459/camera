package com.android.example.cameraxbasic.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

import com.android.example.cameraxbasic.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [PhotoInfoFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [PhotoInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class PhotoInfoFragment : Fragment() {
    private val args: PhotoInfoFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo_info, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val filePath = args.filePath
        Log.d("File", filePath)
    }
}
