fun main () {
    println("You are playing as Iron man and just battled with avengers against Loki the evil Asgardian and brother of Thor." +
            "All the other heroes got mind controlled by Loki and it is up to you to save them!")
    challengeOne()
}

fun challengeOne() {
    val options = arrayOf("close combat", "keep distance and shoot", "try to talk")
    val userChoice = getUserChoice1(options)
    println("User picked $userChoice")
    determineWinner1(userChoice)

}

fun getUserChoice1 (options: Array<String>):String? {
    var userChoice: String?
    do {
        println("You run into a mind controlled Black Widow aka Natasha Romanoff")
        println("What are you gonna do?: close combat - keep distance and shoot - try to talk")
        userChoice = readLine()
    } while (!options.contains(userChoice))

    return  userChoice

}

fun determineWinner1(userChoice: String?){
    if ("keep distance and shoot" == userChoice){
        println("Good job a shot in the head brought her back")
        println("BLACK WIDOW JOINED YOUR TEAM!!")
    } else {
        gameover()
    }
}

fun gameover() {
    println("That was not good choice hero try again and better luck next time")
    return
}