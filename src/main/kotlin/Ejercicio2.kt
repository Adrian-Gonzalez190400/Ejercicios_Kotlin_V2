/*
Desarrollar una función que reciba otra función booleana y una lista, y devuelva otra lista
con los elementos de la lista que devuelvan True al aplicarles la función booleana.
* */

fun getPrimo(funcion:(Int) -> Boolean, lista: MutableList<Int>) : MutableList<Int> {
    var listaPrimos : MutableList<Int> = mutableListOf()
    lista.forEach{
        if (funcion(it))
            listaPrimos.add(it)
    }
    return listaPrimos
}

fun isPrimo(num: Int): Boolean{
    var primo=true
    for (i in 2..num /2){
        if(num%i==0) // no es numero primo
            primo=false
    }
    return primo
}