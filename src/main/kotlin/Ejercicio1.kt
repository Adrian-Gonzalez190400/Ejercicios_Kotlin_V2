/*
Desarrollar una función que simule una calculadora científica que permita calcular el seno, coseno, tangente,
exponencial y logaritmo neperiano. La función preguntará al usuario el valor y la función a aplicar,
y mostrará por pantalla una tabla con los enteros de 1 al valor introducido y el resultado de
aplicar la función a esos enteros.
* */

fun calcular(numero: Int, funcionAplicar: String){


    var funcionError=true
    var valores: MutableList<Double> = mutableListOf()

        for (i in 1..numero) {
            when (funcionAplicar) {
                "seno" -> valores.add(i - 1, Math.sin(i.toDouble()))
                "coseno" -> valores.add(i - 1, Math.cos(i.toDouble()))
                "tangente" -> valores.add(i - 1, Math.tan(i.toDouble()))
                "exponencial" -> valores.add(i - 1, Math.exp(i.toDouble()))
                "logaritmo neperiano" -> valores.add(i - 1, Math.log(i.toDouble()))
                else -> funcionError=false
            }
        }

        if(funcionError) {
            println("Los resultados para la operacion $funcionAplicar son:")
            for (i in 1..numero) {
                println("El $funcionAplicar para $i es -> ${valores.get(i - 1)}")
            }
        }else println("Esa operacion no está disponible")

}