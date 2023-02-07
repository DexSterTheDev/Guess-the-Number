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
In this code, a random number is generated using the Random class and stored in the random variable. The user is then prompted to guess the number using the readLine function. If the user's guess is too low, the program outputs "Too low". If the user's guess is too high, the program outputs "Too high". The loop continues until the user correctly guesses the number, at which point the program outputs "You win! The number was $random".




