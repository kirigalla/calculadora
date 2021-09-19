package com.alonsodelcid.calculadora


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    // variables para nuestro textview y los botones
    lateinit var tvsec: TextView
    lateinit var tvMain: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdiv: Button
    lateinit var Calc_N: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializamos todas nuestras variables
        tvsec = findViewById(R.id.idTVSecondary)
        tvMain = findViewById(R.id.idTVprimary)
        bac = findViewById(R.id.bac)
        bc = findViewById(R.id.bc)
        bbrac1 = findViewById(R.id.bbrac1)
        bbrac2 = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        binv = findViewById(R.id.binv)
        b0 = findViewById(R.id.b0)
        b9 = findViewById(R.id.b9)
        b8 = findViewById(R.id.b8)
        b7 = findViewById(R.id.b7)
        b6 = findViewById(R.id.b6)
        b5 = findViewById(R.id.b5)
        b4 = findViewById(R.id.b4)
        b3 = findViewById(R.id.b3)
        b2 = findViewById(R.id.b2)
        b1 = findViewById(R.id.b1)
        bpi = findViewById(R.id.bpi)
        bmul = findViewById(R.id.bmul)
        bminus = findViewById(R.id.bminus)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bdiv = findViewById(R.id.bdiv)
        Calc_N = findViewById(R.id.Calc_N)

        // añadimos un clicklistener a cada uno de nuestros botones

        Calc_N.setOnClickListener{
             val intent:Intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        b1.setOnClickListener {
            // concatenamos el caracter que queremos que se muestre en el textview
            tvMain.text = (tvMain.text.toString() + "1")
        }
        b2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "2")
        }
        b3.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "3")
        }
        b4.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "4")
        }
        b5.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "5")
        }
        b6.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "6")
        }
        b7.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "7")
        }
        b8.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "8")
        }
        b9.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "9")
        }
        b0.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "0")
        }
        bdot.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ".")
        }
        bplus.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "/")
        }
        bbrac1.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "(")
        }
        bbrac2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ")")
        }
        bpi.setOnClickListener {
            // el valor que estaremos manejando para pi será de 3.1416
            tvMain.text = (tvMain.text.toString() + "3.1416")
            tvsec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "cos")
        }
        btan.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "tan")
        }
        binv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "ln")
        }
        blog.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "log")
        }

        bminus.setOnClickListener {
            // al presionar el boton minus, estaremos checando
            // si el usuario ya ha ingresado un menos en el textview.
            // si ya existe una operacion de tipo 'minus', entonces no se realizara nada
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvMain.text = (tvMain.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            //En este caso, si el signo de multiplicacion no esta presente en el textview
            //entonces simplemente añadimos el operador correspondiente
            val str: String = tvMain.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvMain.text = (tvMain.text.toString() + "*")
            }
        }
        bsqrt.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // Mensaje de error en caso de que no se ingrese ningún número.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvMain.text.toString()

                // A partir de aqui comenzamos con la raiz cuadrada.
                val r = Math.sqrt(str.toDouble())
                // hacemos un parseo de doouble a String para establecer el resultado
                // en nuestro textview.
                val result = r.toString()
                tvMain.setText(result)
            }
        }
        bequal.setOnClickListener {
            val str: String = tvMain.text.toString()
            // Aqui se llama a un metodo de evaluacion para el calculo
            // del valor de nuestras expresiones
            val result: Double = evaluate(str)
            val r = result.toString()
            tvMain.setText(r)
            tvsec.text = str
        }
        bac.setOnClickListener {
            //al presionar el boton ac, estamos despejando
            //nuestro textview primario y secundario
            tvMain.setText("")
            tvsec.setText("")
        }
        bc.setOnClickListener {
            // al presionar el boton c ahora despejamos
            // el ultimo caracter, esto checando el largo (length) de la expresion
            var str: String = tvMain.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                tvMain.text = str
            }
        }
        bsquare.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // Mensaje de error en caso de que no se ingrese ningún número.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // obtenemos la expresion y calculamos su cuadrado
                val d: Double = tvMain.getText().toString().toDouble()
                val square = d * d
                tvMain.setText(square.toString())
                //establecemos la 'd' en el textview secundario
                tvsec.text = "$d²"
            }
        }
        bfact.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // Mensaje de error en caso de que no se ingrese ningún número.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // obtenemos el valor entero 'int' y calculamos el factorial.
                val value: Int = tvMain.text.toString().toInt()
                val fact: Int = factorial(value)
                tvMain.setText(fact.toString())
                tvsec.text = "$value`!"
            }

        }

    }

    fun factorial(n: Int): Int {
        // metodo para encontrar el factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    fun evaluate(str: String): Double {
        return object : Any() {
            // creacion de la variable para el rastreo de posicion
            var pos = -1
            var ch = 0

            // metodo para trasladarnos al siguiente caracter
            fun nextChar() {
                // incrementamos nuestra posicion
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            // este metodo nos sirve para eliminar los espacios extra
            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()
                // si la posicion del char es igual a la del espacio
                //retornamos true
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            //A partir de aqui parseamos nuestras expresiones y obtenemos el reultado 'ans'
            // llamamos a la expresion de pareso correspondiente
            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm() // adicion
                    else if (eat('-'.toInt())) x -= parseTerm() // sustraccion
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor() // multiplicacion
                    else if (eat('/'.toInt())) x /= parseFactor() // division
                    else return x
                }
            }


            // below method is use to parse the factor
            fun parseFactor(): Double {
                //checamos nuestras operaciones de adicion y sustraccion
                if (eat('+'.toInt())) return parseFactor() // suma unitaria
                if (eat('-'.toInt())) return -parseFactor() // resta unitaria
                // creacion de una variable tipo double para el ans
                var x: Double
                // variable de posicion
                val startPos = pos
                // condicionales para checar las aperturas de parentesis
                if (eat('('.toInt())) { // parentesis
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    // numeros
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    // obtenemos las subcadenas de nuestro String
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    // checamos el operador dentro de nuestra expresion
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    // debajo estaremos checando la accion para nuestra raiz cuadrada
                    x =
                        if (func == "sqrt") Math.sqrt(x)
                        // checamos y calculamos la funcion seno a partir de la clase Math
                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)
                            // calculo del coseno
                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)
                            // calculo de la tangente
                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))
                        // calculo de logaritmo base 10
                        else if (func == "log")
                            Math.log10(x)
                        // calculo de ln (logaritmo natural)
                        else if (func == "ln") Math.log(x)
                        // para cualquier error, ejecutamos una excepcion
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {
                    // si la condicion no se satisface, entonces retornamos la excepcion
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // calculo de la potencia de la expresion
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // potenciacion
                return x
            }
            // Por ultimo, llamamos a parsear nuestra expresion
        }.parse()
    }
}