fun b(n: Int)
{
    for (i in 1..n)
    {
        val a = " ".repeat(n - i)
        val h = "#".repeat(2 * i - 1)
        println("$a$h$a")
    }
}

fun main()
{
    println("10.2")
    b(1)
    println()
    b(2)
    println()
    b(3)
}
