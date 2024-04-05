package com.example.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ejercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //se declaran variables
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //se ejecuta

        val alumno1 = Alumnos("sergio", "23")

        val alumno2 = Alumnos("jorge","30")

        val alumno3 = Alumnos("beatriz","24")

        alumno1.nacionalidad = "mexicano"
        alumno2.tipoSexo = "femenino"
        alumno3.dni = "346334"

        binding.tvTitle.text = alumno1.nacionalidad
        binding.tvDescripcion.text = alumno1.nombre
        binding.tvSubtitulo.text = alumno3.dni
        //val titulo = findViewById<TextView>(R.id.tv_title)
        //titulo.text = "BIENVENIDOS A KOTLIN"


    }
    //se crea funciones
}