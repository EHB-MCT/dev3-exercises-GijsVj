class Teacher (override val name: String): Person(name), ChatPartner{
    override fun talk() {
        funFact()
    }
    fun funFact(){
        println("All pictures of Blob fish are dead")
    }
}