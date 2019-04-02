package com.sadiasharmin.devicetools.fragment

import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.sadiasharmin.devicetools.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [DeviceFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DeviceFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class DeviceFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(  inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_device, container, false)
        Log.i("ManuFacturer :", Build.MANUFACTURER)
        Log.i("Board : ", Build.BRAND)
        Log.i("Display : ", Build.MODEL)
        Log.i("model : ", Build.BOARD)
        Log.i("model : ", Build.HARDWARE)
        Log.i("model : ", Build.ID)
        Log.i("model : ", Build.BOOTLOADER)
        Log.i("model : ", Build.USER)
        Log.i("model : ", Build.HOST)
        val tvManufacturer =v.findViewById<TextView>(R.id.tvManufacturer)
        tvManufacturer.text= Build.MANUFACTURER
        val tvBrand =v.findViewById<TextView>(R.id.tvBrand)
        tvBrand.text= Build.BRAND
        val tvModel =v.findViewById<TextView>(R.id.tvModel)
        tvModel.text= Build.MODEL
        val tvBoard =v.findViewById<TextView>(R.id.tvBoard)
        tvBoard.text= Build.BOARD
        val tvHardware =v.findViewById<TextView>(R.id.tvHardware)
        tvHardware.text= Build.HARDWARE
        val tvID =v.findViewById<TextView>(R.id.tvID)
        tvID.text= Build.ID
        val tvBootLoader =v.findViewById<TextView>(R.id.tvBootLoader)
        tvBootLoader.text= Build.BOOTLOADER
        val tvUser =v.findViewById<TextView>(R.id.tvUser)
        tvUser.text= Build.USER
        val tvHost =v.findViewById<TextView>(R.id.tvHost)
        tvHost.text= Build.HOST
        return v
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DeviceFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DeviceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
