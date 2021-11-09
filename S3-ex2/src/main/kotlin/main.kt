fun main() {
    val persons = arrayOf(Comedian("Mike"), Teacher("Bert"), Student("Gijs"), Chatbot("clippy"))

    val chatPartner = persons.random()
    chatPartner.introduce()
    chatPartner.talk()}