package com.may.restuarantmenuapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.food_ticket.view.*

class MainActivity : AppCompatActivity() {

    var  adapter:FoodAdapter?=null
    var listoffoods =ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listoffoods.add(Food("Coffee","Coffee is a brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species. The genus Coffea is native to tropical Africa and Madagascar, the Comoros, Mauritius, and Réunion in the Indian Ocean.",R.drawable.coffee))

        listoffoods.add(Food("Coffee pot","Coffeemakers or coffee machines are cooking appliances used to brew coffee. While there are many different types of coffeemakers using a number of different brewing principles, in the most common devices, coffee grounds are placed in a paper or metal filter inside a funnel, which is set over a glass or ceramic coffee pot, a cooking pot in the kettle family",R.drawable.coffee_pot))

        listoffoods.add(Food("FRENCH FRIES","French fries, or simply fries; chips, finger chips, or french-fried potatoes are batonnet or allumette-cut deep-fried potatoes",R.drawable.french_fries))

        listoffoods.add(Food("Honey","Honey is a sweet, viscous food substance produced by bees and some related insects. Bees produce honey from the sugary secretions of plants or from secretions of other insects, by regurgitation, enzymatic activity, and water evaporation. Bees store honey in wax structures called honeycombs",R.drawable.honey))

        listoffoods.add(Food("Strawberry icecream","Strawberry ice cream is a flavor of ice cream made with strawberry or strawberry flavoring. It is made by blending in fresh strawberries or strawberry flavoring with the eggs, cream, vanilla and sugar used to make ice cream. Most strawberry ice cream is colored pink or light red.",R.drawable.strawberry_icecream))

        listoffoods.add(Food("Sugar cubes","Sugar, shaped in cubes usually measuring about 4 grams (3/4 tsp) each, often used for coffee or tea. Sugar cubes can be created to look roughly the same size but contain reduced sugar content through a special production process",R.drawable.sugar_cubes))
        adapter= FoodAdapter(this,listoffoods)
        gv_foodlist.adapter=adapter

    }

    class FoodAdapter:BaseAdapter{

        var listoffoods =ArrayList<Food>()
        var context:Context?=null


        constructor(context: Context,listoffoods:ArrayList<Food>):super(){
            this.listoffoods=listoffoods
            this.context=context

        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var food =listoffoods[position]
            var inflator= context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodview=inflator.inflate(R.layout.food_ticket,null)
            foodview.iv_food_image.setImageResource(food.image!!)
            foodview.iv_food_image.setOnClickListener {
                val intent = Intent(context,FoodDetails::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("des",food.des!!)
                intent.putExtra("image",food.image!!)
                context!!.startActivity(intent)


            }

            foodview.tv_name.text = food.name!!
            return foodview

        }

        override fun getItem(position: Int): Any {
            return  listoffoods[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {

            return listoffoods.size
        }


    }
}
