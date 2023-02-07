import java.util.*

fun main() {
    val random = Random().nextInt(100) + 1
    var guess = 0

    while (guess != random) {
        println("Enter your guess (1-100):")
        guess = readLine()!!.toInt()
        if (guess < random) {
            println("Too low")
        } else if (guess > random) {
            println("Too high")
        }
    }

    println("You win! The number was $random")
}




