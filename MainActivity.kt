package com.example.todolist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext:EditText = findViewById(R.id.writeitem)
        val button:Button = findViewById(R.id.additem)
        var listView:ListView = findViewById(R.id.list_item)

        var itemlist = arrayListOf<String>()

        button.setOnClickListener{
            itemlist.add(edittext.text.toString())

            listView.adapter = ArrayAdapter<String>(Context: this
                            ,android.R.layout.simple_list_item_1
                            ,itemlist)

        }

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(Context: this, text: "you click on"+itemlist.get(i)
            ,Toast.LENGTH_SHORT).show()
        }
    }
}
