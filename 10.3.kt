fun c(t: String, s: Int): String {
    return t.map  { char ->
        when
        {
            char.isLetter() ->
                {
                val b = if (char.isLowerCase()) 'a' else 'A'
                (b + (char - b + s) % 26).toChar()
            }
            else -> char
        }
    }.joinToString("")
}

fun main()
{
    println("10.3")
    println(c("котлин лучше", 3))
}
