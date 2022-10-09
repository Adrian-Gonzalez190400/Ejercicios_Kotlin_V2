/*
Construir una función que permita hacer búsqueda de inmuebles en función de un presupuesto dado.
La función recibirá como entrada la lista de inmuebles y un precio, y devolverá otra lista con los
inmuebles cuyo precio sea menor o igual que el dado. Los inmuebles de la lista que se devuelva deben
incorporar un nuevo par a cada diccionario con el precio del inmueble, donde el precio de un inmueble se
calcula con las siguiente fórmula en función de la zona:

Zona A: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100)
Zona B: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100) * 1.5

* */

fun addPrecio(inmuebles: MutableList<MutableMap<String,String>>):MutableList<MutableMap<String,String>>{
    var precio=0.0;
    var zona=1.0;
    var garage=15000.0

    inmuebles.forEach{
        zona=1.0
        garage=0.0
        if (it["zona"]=="B") zona=1.5
        if(it["garage"].toBoolean()) garage=15000.0 else 0.0

        var precio= (it["metros"]!!.toDouble().times(1000.0) + it["habitaciones"]!!.toDouble().times(5000.0)
                + garage )*
                (1.0- (2022-it["año"]!!.toDouble()).div(100))* zona
        it["precio"]=precio.toString()

    }

    return inmuebles
}

fun busca_Casa(inmuebles: MutableList<MutableMap<String,String>>, precio:Double):MutableList<MutableMap<String,String>>{
    var casas: MutableList<MutableMap<String,String>> = mutableListOf()

    inmuebles.forEach{
        if (it["precio"]!!.toDouble()<=precio)
            casas.add(it)
    }
    return casas
}