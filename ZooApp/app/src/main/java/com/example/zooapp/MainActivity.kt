package com.example.zooapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_ticket.view.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    var listofanimals=ArrayList<Animal>()
    var  adapter: AnimalAdapter? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listofanimals.add(Animal("Bambi","It mostly found in brown color",R.drawable.bambi,false))

        listofanimals.add(Animal("Panda","Panda is cute and fluffy.",R.drawable.panda,false))

        listofanimals.add(Animal("Tiger","Tiger is one of the meat eating animals.",R.drawable.tiger,true))

        listofanimals.add(Animal("Penguin","penguins love to play in groups",R.drawable.penguin,false))

        listofanimals.add(Animal("Swallow","Swallows have multi colors in their furs",R.drawable.swallow_bird,false))

        listofanimals.add(Animal("Zebra","Its seems funny that zebra's are advance form of donkeys",R.drawable.zebra,false))

        adapter = AnimalAdapter(this,listofanimals)
        lvanimal.adapter=adapter
    }


    fun delete(index:Int){
        listofanimals.removeAt(index)
        adapter!!.notifyDataSetChanged()

    }

    fun add(index: Int){
        listofanimals.add(index,listofanimals[index])
        adapter!!.notifyDataSetChanged()
    }
    inner class  AnimalAdapter:BaseAdapter{
        var listofanimals= ArrayList<Animal>()

        var context:Context?=null
        constructor(context:Context,listofanimals: ArrayList<Animal>){
            this.listofanimals=listofanimals
            this.context=context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val animals= listofanimals[position]

            if (animals.iskiller==true){
                var inflater=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                var  myview= inflater.inflate(R.layout.animal_killer_ticket,null)
                myview.tvdes.text= animals.des
                myview.tvname.text= animals.name
                myview.ivanimal.setImageResource(animals.image!!)
                myview.ivanimal.setOnClickListener {

//                    delete(position)
                    val intent = Intent(context,AnimalsInfo::class.java)
                    intent.putExtra("name",animals.name!!)
                    intent.putExtra("des",animals.des!!)
                    intent.putExtra("image", animals.image!!)
                    context!!.startActivity(intent)

                }
                return  myview

            }
            else{

            var inflater=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var  myview= inflater.inflate(R.layout.animal_ticket,null)
            myview.tvdes.text= animals.des
            myview.tvname.text= animals.name
            myview.ivanimal.setImageResource(animals.image!!)
                myview.ivanimal.setOnClickListener {

                    val intent = Intent(context,AnimalsInfo::class.java)
                    intent.putExtra("name",animals.name!!)
                    intent.putExtra("des",animals.des!!)
                    intent.putExtra("image", animals.image!!)
                    context!!.startActivity(intent)

                }
            return  myview
            }

        }

        override fun getItem(position: Int): Any {
            return listofanimals[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listofanimals.size
        }

    }
}
