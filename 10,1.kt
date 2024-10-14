fun a(n: Int): List<Int>
{
    return if (n <= 0)
    {
        listOf()
    }
        else
    {
        (n downTo 1).toList()
    }
}


fun main()
{
    println("10.1")
    println(a(0)) // []
    println(a(2)) // [2, 1]
    println(a(5)) // [5, 4, 3, 2, 1]
}
