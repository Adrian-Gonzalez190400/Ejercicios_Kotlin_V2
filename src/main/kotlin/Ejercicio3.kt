/*
Escribir una función reciba una lista de calificaciones y devuelva la lista de calificaciones
correspondientes a esas notas.
*
95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
*/

fun calif(notas: MutableList<Int>) : MutableList<String>{
    var calificaciones :MutableList<String> = mutableListOf()
    notas.forEach{
        when (it){
           in 95..100 -> calificaciones.add("Excelente")
           in 85..94 -> calificaciones.add("Notable")
           in 75..84 -> calificaciones.add("Bueno")
           in 70..74 -> calificaciones.add("Suficiente")
           else -> calificaciones.add("Desempeño insuficiente")
        }
    }
    return calificaciones
}