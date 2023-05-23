package com.example.proyecto_dp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton1 = findViewById<Button>(R.id.button1)
        var txtBuscar = findViewById<TextView>(R.id.autoCompleteTextView1)


        boton1.text = "INGRESAR"
        boton1.setOnClickListener{
            txtBuscar.text = "El evento se ha ejecutado"
//            Toast.makeText(
//                this,
//                "Esto aparece",
//                Toast.LENGTH_SHORT).show()


            var f = Snackbar.make(
                boton1,
                "Este es otro mensaje",
                Snackbar.LENGTH_SHORT)


            f.show()
        }
    }
}