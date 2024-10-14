fun d(n: Int): List<Any>
{
    return (1..n).map { i ->
        when
        {
            i % 3 == 0 && i % 5 == 0 -> "ВизллБизлл"
            i % 3 == 0 -> "Физллл"
            i % 5 == 0 -> "Бизлллл"
            else -> i
        }
    }
}


fun main()
{
    println("10.4")
    println(d(5))
    println(d(16))
}
