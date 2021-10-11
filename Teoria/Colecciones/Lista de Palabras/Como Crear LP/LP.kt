fun main()
{

    val p = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val fp = p.filter{ it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
    .sorted()
    
    println(fp)
}