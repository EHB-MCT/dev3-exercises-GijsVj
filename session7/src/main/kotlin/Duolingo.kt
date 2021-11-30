class Duolingo {
    private var roundSize: Int = 5
    private var language: String = "en"

    constructor(difficulty: String) {
        when(difficulty) {
            "easy" -> {
                this.roundSize = 3
                this.language = arrayOf("en").random()
            }
            "hard" -> {
                this.roundSize = 8
                this.language = "all"
            }
        }
    }

    val words = mutableSetOf<Word>(
        Word("vache", "koe", "fr"),
        Word("spaghetti", "spaghetti", "en"),
        Word("homme", "mens", "fr"),
        Word("hair", "haar", "en"),
        Word("poubelle", "vuilbak", "fr"),
        Word("water", "water", "en"),
        Word("ordinateur", "computer", "fr"),
        Word("chicken", "kip", "en"),
        Word("porte", "deur", "fr"),
        Word("finger", "vinger", "en")
    )


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
                println("Jammer het juiste woord is: ${randomWord.translated}. Probeer het sewes opnieuw.")
            }
            println("Nog ${randomWords.count()} vragen.")
        }

    }
}