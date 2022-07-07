package com.example.climatoday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityOptionsCompat


class telaInicio : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_tela_inicio)


            var btSearch = findViewById<Button>(R.id.button_search) as Button

            btSearch.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))


                var edtText = findViewById(R.id.cidade_digitada) as EditText
                var texto = edtText.text.toString()

                var Resultado = texto

                    com.example.climatoday.CITY = Resultado

            }


        }

    }

