fun main(arg: Array<String>) {
    val chars = Array(96, { i -> 0x20 + i })
    while (!chars.all { c -> c == 0x20 }) {
        chars.forEach { c -> print(c.toChar()); if (c % 16 == 0) println() }
        chars[readLine()!![0].toInt() - 0x20] = 0x20
    }
}