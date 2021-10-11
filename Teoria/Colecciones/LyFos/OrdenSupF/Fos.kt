fun main()
{
    val NPersona = listOf("Luis", "Steven", "Emiliano", "Marvin")
    println(NPersona.sorted())
    println(NPersona.sortedWith{str1: String, str2: String -> str1.length - str2.length})
    


}