package com.example.complexlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var mylist= mutableListOf<models>()
//        lets add images,title and description

        mylist.add(models("black","This is the first model",R.drawable.bike1))
        mylist.add(models("red","This is the second model",R.drawable.bike2))
        mylist.add(models("black","This is the third model",R.drawable.bike3))
        mylist.add(models("red","This is the fourth model",R.drawable.bike4))
        mylist.add(models("black","This is the fifth model",R.drawable.bike5))
        mylist.add(models("black","This is the sixth model",R.drawable.bike6))
        mylist.add(models("black","This is the seventh model",R.drawable.bike7))
        mylist.add(models("red","This is the eighth model",R.drawable.bike8))
        mylist.add(models("red","This is the ninth model",R.drawable.bike9))
        mylist.add(models("red","This is the tenth model",R.drawable.bike10))
        listview.adapter=Myadapter(this,R.layout.row,mylist)





    }
}