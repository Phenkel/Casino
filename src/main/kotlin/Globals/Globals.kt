package Globals

val SPADE_SYMBOL = '\u2660'
val DIAMOND_SYMBOL = '\u2666'
val HEART_SYMBOL = '\u2665'
val CLOVER_SYMBOL = '\u2663'
val RESET = "\u001B[0m"
val BLUE = "\u001B[34m"
val RED = "\u001B[31m"
val GREEN = "\u001B[32m"

var balance: Double = 10000.0
var bet: Double = 5000.0
var name: String = ""

var leaveCasino: Boolean = false

fun successMessage(text: String) {
    println(GREEN + text + RESET)
}

fun errorMessage(text: String) {
    println(RED + text + RESET)
}