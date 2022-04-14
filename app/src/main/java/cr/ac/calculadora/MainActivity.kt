package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    var texto : TextView ?= null
    var linea : String ?= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonC : Button = findViewById(R.id.buttonC)
        botonC.setOnClickListener{botonCclick()}

        val botonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        botonPorcentaje.setOnClickListener{botonPorcentajeclick()}

        val botonDivide : Button = findViewById(R.id.buttonDivide)
        botonDivide.setOnClickListener{botonDivideclick()}

        val boton7 : Button = findViewById(R.id.boton7)
        boton7.setOnClickListener{boton7click()}

        val boton8 : Button = findViewById(R.id.boton8)
        boton8.setOnClickListener{boton8click()}

        val boton9 : Button = findViewById(R.id.boton9)
        boton9.setOnClickListener{boton9click()}

        val botonX : Button = findViewById(R.id.botonX)
        botonX.setOnClickListener{botonXclick()}

        val boton4 : Button = findViewById(R.id.boton4)
        boton4.setOnClickListener{boton4click()}

        val boton5 : Button = findViewById(R.id.boton5)
        boton5.setOnClickListener{boton5click()}

        val boton6 : Button = findViewById(R.id.boton6)
        boton6.setOnClickListener{boton6click()}

        val botonMenos : Button = findViewById(R.id.botonMenos)
        botonMenos.setOnClickListener{botonMenosclick()}

        val boton1 : Button = findViewById(R.id.boton1)
        boton1.setOnClickListener{boton1click()}

        val boton2 : Button = findViewById(R.id.boton2)
        boton2.setOnClickListener{boton2click()}

        val boton3 : Button = findViewById(R.id.boton3)
        boton3.setOnClickListener{boton3click()}

        val botonMas : Button = findViewById(R.id.botonMas)
        botonMas.setOnClickListener{botonMasclick()}

        val boton0 : Button = findViewById(R.id.boton0)
        boton0.setOnClickListener{boton0click()}

        val botonComa : Button = findViewById(R.id.botonComa)
        botonComa.setOnClickListener{botonComaclick()}

        val botonIgual : Button = findViewById(R.id.botonIgual)
        botonIgual.setOnClickListener{botonIgualclick()}

        texto = findViewById(R.id.pantalla)

        val expresion = Expression("2+2")

    }

    private fun botonIgualclick() {
        val expression = Expression (linea)
        linea = expression.calculate().toString()
        texto?.text = linea
        linea = ""
    }

    private fun botonComaclick() {
        linea += "."
        texto?.text = linea
    }

    private fun boton0click() {
        linea += "0"
        texto?.text = linea
    }

    private fun botonMasclick() {
        linea += "+"
        texto?.text = linea
    }

    private fun boton3click() {
        linea += "3"
        texto?.text = linea
    }

    private fun boton2click() {
        linea += "2"
        texto?.text = linea
    }

    private fun boton1click() {
        linea += "1"
        texto?.text = linea
    }

    private fun botonMenosclick() {
        linea += "-"
        texto?.text = linea
    }

    private fun boton6click() {
        linea += "6"
        texto?.text = linea
    }

    private fun boton5click() {
        linea += "5"
        texto?.text = linea
    }

    private fun boton4click() {
        linea += "4"
        texto?.text = linea
    }

    private fun botonXclick() {
        linea += "*"
        texto?.text = linea
    }

    private fun boton9click() {
        linea += "9"
        texto?.text = linea
    }

    private fun boton8click() {
        linea += "8"
        texto?.text = linea
    }

    private fun boton7click() {
        linea += "7"
        texto?.text = linea
    }

    private fun botonDivideclick() {
        linea += "/"
        texto?.text = linea
    }

    private fun botonPorcentajeclick() {
        linea += "%"
        texto?.text = linea
    }

    private fun botonCclick() {
        linea = ""
        texto?.text = "0"
    }


}