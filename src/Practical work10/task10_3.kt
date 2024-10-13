fun caesarCipher(text: String, shift: Int, encrypt: Boolean = true): String {
    val result = StringBuilder()
    val effectiveShift = if (encrypt) shift % 26 else -shift % 26
    for (char in text) {
        if (char.isLetter()) {
            val base = if (char.isLowerCase()) 'a' else 'A'
            val shiftedChar = (base + (char - base + effectiveShift + 26) % 26)
            result.append(shiftedChar)
        } else {
            result.append(char)
        }
    }
    return result.toString()
}

fun main() {
    val originalText = "Hello, World!"
    val shift = 3

    val encrypted = caesarCipher(originalText, shift, encrypt = true)
    println("Encrypted: $encrypted")
    val decrypted = caesarCipher(encrypted, shift, encrypt = false)
    println("Decrypted: $decrypted")
}