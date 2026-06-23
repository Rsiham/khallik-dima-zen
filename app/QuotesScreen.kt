package com.example.khallikdimazen

class QuotesScreen {

    private val repository = AffirmationRepository()

    fun showAllQuotes() {
        println("📚 Toutes les citations")

        repository.getAllAffirmations().forEach {
            println("- ${it.text}")
        }
    }
}
