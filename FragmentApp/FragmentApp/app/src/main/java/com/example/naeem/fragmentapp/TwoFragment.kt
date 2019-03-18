package com.example.naeem.fragmentapp

//import android.content.Context
//import android.net.Uri
//import android.os.Bundle
//import android.support.v4.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
import com.sun.jndi.toolkit.url.Uri
import javax.naming.Context
import javax.swing.text.View


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TwoFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TwoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TwoFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)

    }

    fun onCreateView(inflater: LayoutInflater, container: ViewGroup,
                     savedInstanceState: Bundle): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }


//    fun onAttach(context: Context) {
//        super.onAttach(context)
//
//    }

//    fun onDetach() {
//        super.onDetach()
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }
}// Required empty public constructor

private val Any.fragment_two: Any
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


class ViewGroup {

}

class LayoutInflater {
    fun inflate(fragment_two: Any, container: ViewGroup, b: Boolean): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Bundle {

}
