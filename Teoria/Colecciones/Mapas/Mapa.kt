fun main()
{
   
    val Ep = mutableMapOf<String, Int>("Luis" to 19,"Steven" to 22)
    val Fn = Ep.filter{it.key.length < 4}
    Ep.put("Marvin",17)
    Ep["Emiliano"] = 19
    Ep["Luis"] = 20
    println(Ep)
    
    println(Ep.map{"${it.key} tiene ${it.value}"}.joinToString(", "))
    println(Fn)


}