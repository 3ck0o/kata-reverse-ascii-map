fun main(arg: Array<String>) {
    val chars = Array(96, { i -> (0x20 + i).toChar() })
    while (!chars.all { c -> c == ' ' }) {
        chars.forEach { c -> print(c); if (c.toInt() % 16 == 0) println() }
        chars[readLine()!![0].toInt() - 0x20] = ' '
    }
}