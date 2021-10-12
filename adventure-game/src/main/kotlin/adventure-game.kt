fun main () {
    println("You are playing as Iron man and just battled with avengers against Loki the evil Asgardian and brother of Thor." +
            "All the other heroes got mind controlled by Loki and it is up to you to save them!")
    challengeOne()
}

fun challengeOne() {
    val answers = setOf<String>("close combat", "keep distance and shoot", "try to talk")
    println("What are you gonna do?: close combat - keep distance and shoot - try to talk")
    val userAnswer = readLine()

    if (answers.contains(userAnswer)) {
        println("Good job you're Iron man armor is too strong for Clint to beat in hand-to-hand combat")
        println("You hit him in the head and he is back")
        println("HAWKEYE JOINED YOUR TEAM!!")
        println("You will be Hawkeye for the next battle")
        challengeTwo()

    } else {
        gameover()
    }

}

fun challengeTwo() {
    println("You run into a mind controlled Black Widow aka Natasha Romanoff")
    println("Try to hit her in the hit her in the right zone with an arrow")
    println("choose: low - high")
    val diceResult = (1..6).random()
    val userAnswer = readLine()
    if (userAnswer == "low" && (1..3).contains(diceResult)) {
        println("Good shot Hawkeye! You hit her in the right position and freed her from her mind controle")
        challengeThree()
    } else if (userAnswer == "high" && (1..3).contains(diceResult)) {
        println("Good shot Hawkeye! You hit her in the right position and freed her from her mind controle")
        challengeThree()
    } else {
        gameover()
    }
}

fun challengeThree() {
    println("You will play as Black Widow for the next battle")
    println("You run into Loki who is with The incredible Hulk aka Doctor Bruce Banner")
}

fun gameover() {
    println("That was not good hero try again and better luck next time!")
    return
}



