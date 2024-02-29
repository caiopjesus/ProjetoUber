package com.example.projetouber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = findViewById<Button>(R.id.btnCalcular)
        btCalcular.setOnClickListener {
            val editsalario = findViewById<EditText>(R.id.editSalario)
            val editkm = findViewById<EditText>(R.id.editKm)
            val result = findViewById<TextView>(R.id.lblResult)
            val salario = editsalario?.text.toString().toDouble()
            val km = editkm?.text.toString().toDouble()

            if (km<=500.00) {
                val calc1 = (0.10/100.00 * salario * km) + salario
                result.text = calc1.toString()
            }
            else if (km>500.00 && km<=1000.00){
                val calc2 = (0.15/100.00 * salario * km) + salario
                result.text = calc2.toString()
            }
            else if (km>1000.00 && km<=2000.00){
                val calc3 = (0.25/100.00 * salario * km) + salario
                result.text = calc3.toString()
            }
            else if (km>2000.00){
                val calc4 = (0.30/100.00 * salario * km) + salario
                result.text = calc4.toString()
            }
        }
    }
}