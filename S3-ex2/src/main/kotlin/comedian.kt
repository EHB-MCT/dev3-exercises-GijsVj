class Comedian (override val name: String): Person(name), ChatPartner{
    override fun talk() {
        tellJoke()
    }
    fun tellJoke() {
        println("69 hahahah funny number")
    }
}