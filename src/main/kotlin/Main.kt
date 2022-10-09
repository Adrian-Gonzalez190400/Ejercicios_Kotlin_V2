fun main(args: Array<String>) {
/*
   println("*************************************************************")
   println("***********************EJERCICIO 1***********************");
   print("Ingresa un valor: ")
   var numero : Int=0
   try {
      numero = readln().toInt()
   }catch (_: NumberFormatException){
      println("Ingrese un numero entero\nPROGRAMA TERMINADO")
      return
   }
   print("Que operacion quieres hacer: ")
   var funcionAplicar= readln()

   calcular(numero,funcionAplicar)
*/

   println("\n\n*************************************************************")
   println("***********************EJERCICIO 2***********************");
   var numeros : MutableList<Int> = mutableListOf(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26)
   println("Los numeros primos de la lista -> ${numeros.joinToString (", ")} son :")
   println(getPrimo(::isPrimo,numeros).joinToString (",") )


   println("\n\n*************************************************************")
   println("***********************EJERCICIO 3***********************");
   var notas : MutableList<Int> = mutableListOf(95,85,75,70,69,100,94,84,75,15)
   println("Para las calificaciones ${notas.joinToString(", ")}")
   println("Corresponde siguientes notas -> ${calif(notas).joinToString(", ")}")


   println("\n\n************************************************************")
   println("*****************RESULTADOS DEL EJERCICIO 4*****************")
   var notasAlu:MutableMap<String,Double> = mutableMapOf(
      "espanol" to 95.0, "matematicas" to 86.0, "ciencias" to 77.0, "actividad complementaria v" to 70.0,
      "prog. web" to 65.0)
   var notasFinal:MutableMap<String,String> = calcularCalif(notasAlu)
   println(notasFinal.entries.joinToString {"${it.key}->${it.value}"})



   println("\n\n************************************************************")
   println("*****************RESULTADOS DEL EJERCICIO 5*****************")

   var inmueble1: MutableMap<String,String> = mutableMapOf("año" to 2000.0.toString(),
      "metros" to  100.0.toString(), "habitaciones" to 3.toString(), "garage" to true.toString(), "zona" to "A")

   var inmueble2: MutableMap<String,String> = mutableMapOf("año" to 2012.0.toString(),
      "metros" to  60.0.toString(), "habitaciones" to 2.toString(), "garage" to true.toString(), "zona" to "B")

   var inmueble3: MutableMap<String,String> = mutableMapOf("año" to 1980.0.toString(),
      "metros" to  120.0.toString(), "habitaciones" to 4.toString(), "garage" to false.toString(), "zona" to "A")

   var inmueble4: MutableMap<String,String> = mutableMapOf("año" to 2005.0.toString(),
      "metros" to  75.0.toString(), "habitaciones" to 3.toString(), "garage" to true.toString(), "zona" to "B")

   var inmueble5: MutableMap<String,String> = mutableMapOf("año" to 2015.0.toString(),
      "metros" to  90.0.toString(), "habitaciones" to 2.toString(), "garage" to false.toString(), "zona" to "A")


   var casas : MutableList<MutableMap<String,String>> =mutableListOf(inmueble5,inmueble2,inmueble3,inmueble4,inmueble1)

   var res=addPrecio(casas)
   var res2=busca_Casa(casas,110000.0)
   println("\n---CASAS DISPONIBLES---")
   res.forEach { println(it) }
   println("\n---CASAS DISPONIBLES DESPUES DE APLICAR EL FILTRO---\n")
   res2.forEach{println(it)}


}