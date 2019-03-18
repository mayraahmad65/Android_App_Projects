package com.example.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick (view:View){

        val btnSelect = view as Button
        var cellID=0
        when (btnSelect.id){
            R.id.btn1->cellID=1
            R.id.btn2->cellID=2
            R.id.btn3->cellID=3
            R.id.btn4->cellID=4
            R.id.btn5->cellID=5
            R.id.btn6->cellID=6
            R.id.btn7->cellID=7
            R.id.btn8->cellID=8
            R.id.btn9->cellID=9


        }

         playgame(cellID, btnSelect)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activeplayer=1

    fun playgame(cellID:Int, btnSelect:Button){
        if (activeplayer==1)
        {
            btnSelect.text="X"
            btnSelect.setBackgroundColor(Color.MAGENTA)
            player1.add(cellID)
            activeplayer=2
            autoplay()
        }

        else{
            btnSelect.text="O"
            btnSelect.setBackgroundColor(Color.GREEN)
            player2.add(cellID)
            activeplayer=1
        }
        btnSelect.isEnabled=false
        checkwinner()
    }

     fun checkwinner() {

         var winner = -1

         //row 1
         if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
             winner = 1
         }
         if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
             winner = 2
         }

         //row 2
         if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
             winner = 1
         }
         if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
             winner = 2
         }

         //row 3
         if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
             winner = 1
         }
         if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
             winner = 2
         }

         //col 1
         if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
             winner = 1
         }
         if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
             winner = 2
         }

         //col 1
         if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
             winner = 1
         }
         if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
             winner = 2
         }

         //col 1
         if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
             winner = 1
         }
         if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
             winner = 2
         }

         if (winner != -1){
             if (winner == 1) {
                 Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show()

             } else {
                 Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show()
             }
     }
    }

    fun autoplay(){
        var emptycells= ArrayList<Int>()
        for (cellID in 1..9){

            if (!(player1.contains(cellID) || player2.contains(cellID))){
                emptycells.add(cellID)
            }
        }

        val  r=Random
        val  randindex = r.nextInt(emptycells.size-0)+0
        val cellID= emptycells[randindex]
        var  btnSelect:Button?
        when(cellID){
            1-> btnSelect=btn1
            2-> btnSelect=btn2
            3-> btnSelect=btn3
            4-> btnSelect=btn4
            5-> btnSelect=btn5
            6-> btnSelect=btn6
            7-> btnSelect=btn7
            8-> btnSelect=btn8
            9-> btnSelect=btn9
            else->{
                btnSelect=btn1
            }
        }
        playgame(cellID,btnSelect)
    }

}
