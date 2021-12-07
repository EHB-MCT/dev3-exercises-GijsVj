class Duolingo(val roundSize: Int = 5,  val language: String = "fr") {


    var words = mutableSetOf<Word>(
        FrenchWord("vache", "koe"),
        EnglishWord("spaghetti", "spaghetti"),
        FrenchWord("homme", "mens"),
        EnglishWord("hair", "haar"),
        FrenchWord("poubelle", "vuilbak"),
        EnglishWord("water", "water"),
        FrenchWord("ordinateur", "computer"),
        EnglishWord("chicken", "kip"),
        FrenchWord("porte", "deur"),
        EnglishWord("finger", "vinger")
    )


    init {
       words =  words.filter {it.language == language}.toMutableSet()
    }

    fun play() {
        val randomWords = words.shuffled().take(roundSize).toMutableSet()

        while (randomWords.isNotEmpty()) {
            val randomWord = randomWords.random()
            println(randomWord.original)
            val userAnswer = readLine()

            if (userAnswer == randomWord.translated) {
                randomWords.remove(randomWord)
                println("goed gedaan!")
            }
            else{
                println("Jammer het juiste woord is: ${randomWord.translated}. Doet da sebiet nu is goe.")
            }
            println("Nog ${randomWords.count()} vragen.")
        }

    }
}