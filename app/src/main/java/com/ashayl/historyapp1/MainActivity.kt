package com.ashayl.historyapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var textView: TextView
    private lateinit var ClearButton: Button
    private lateinit var EnterButton: Button
    private lateinit var editText: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize
        textView=findViewById(R.id.textView)
        ClearButton=findViewById(R.id.ClearButton)
        EnterButton=findViewById(R.id.EnterButton)
        editText=findViewById(R.id.editText)

        EnterButton.setOnClickListener {
            val age = editText.text.toString().toIntOrNull()

            if (age != null && age in 20..100){
                val famousPerson=when (age){
                    20 -> "Pop Smoke formally known as Bashar Bakarah Jackson, an American Rapper born and raised in Brooklyn"
                    30 -> "Lisa Lopes, American rapper and singer, she was a member of R&B girl group TLC"
                    40 -> "Paul Walker known for his role in Fast & Furious known as Brian O'Conner"
                    50 -> "Michael Jackson made his debut in 1964"
                    60 -> "Steve McQueen was an American and racing driver"
                    70 -> "John Lennon, English singer, songwriter and musician. Guitarist of the Beatles"
                    80 -> "Mickey Hargitay, former Mr. Universe. He was an underground fighter in World War 2"
                    90 -> "Colonel Sanders revolutionized American fast food by founding KFC"
                    100 -> "Diosa Costello entertainer, performer, producer and club owner"
                    else -> null
                }
                val message = if (famousPerson != null) "The celebrity is $famousPerson"
                else "No one was found with age entered"
                textView.text=message
            }else{
                textView.text="Invalid age, Please enter an age between 20 an 100"
            }
            ClearButton.setOnClickListener {
                editText.text.clear()
                textView.text=""
            }
        }

    }
}