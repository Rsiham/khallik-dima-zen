package com.example.khallikdimazen

class RandomQuoteScreen {

    private val repository = AffirmationRepository()

    fun showRandomQuote() {
        val affirmation = repository.getRandomAffirmation()

        println("🎲 Citation surprise")
        println(affirmation.text)
    }
}
