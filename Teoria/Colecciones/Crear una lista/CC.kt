fun main()
{

//Mutable
 val set1 = setOf(1,2,3)

 //Inmutable

 val set2 = mutableSetOf(3,2,1)

 //--------------------------------//

 val numeros = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
 val conjunto = numeros.toSet()

 println("Lista ${numeros}")
 println("Ordenados  ${numeros.sorted()}")
 println("Conjunto: $conjunto")
 println("$set1 == $set2: ${set1 == set2}")
 println("contiene 7: ${conjunto.contains(7)}")
 

}