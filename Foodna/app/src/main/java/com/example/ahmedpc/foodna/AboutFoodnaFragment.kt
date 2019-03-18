package com.example.ahmedpc.foodna

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.reflect.KClass


class AboutFoodnaFragment : Fragment() {

    internal lateinit var myview: View

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (inflater != null) {
            myview = inflater.inflate(R.layout.fragment_about_foodna, container, false)
        }
        return myview
    }
}

fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment
    return inflater!!.inflate(R.layout.fragment_about_foodna, container, false)
}

//fun onCreate(savedInstanceState: Bundle?) {
//    val onCreate: Any = onCreate(savedInstanceState)
//    setContentView(R.layout.activity_about_foodna)
//
//        val btnsidebar = findViewById(R.id.about_foodna_btn_sidebar)
//        btnsidebar.setOnClickListener(View.OnClickListener {
//            val intent = Intent(AboutFoodnaFragment.this, SideBarActivityMain::class.) })
//
//
//}

private fun Any.setOnClickListener(onClickListener: View.OnClickListener) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun findViewById(about_foodna_btn_sidebar: Int) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun setContentView(activity_about_foodna: Int) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
//
//    private fun Intent(aboutFoodnaFragment: AboutFoodnaFragment, java: Uri?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    private fun findViewById(about_foodna_btn_sidebar: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    private fun setContentView(activity_about_foodna: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//}
//
////private val <T> KClass<T>.Uri: Uri?
////    get() {
////        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
////    }
//
//private fun Any.setOnClickListener(onClickListener: View.OnClickListener) {
//
//
//}
