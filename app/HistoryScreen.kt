package com.example.khallikdimazen

class HistoryScreen {

    private val history = mutableListOf<Affirmation>()

    fun addToHistory(affirmation: Affirmation) {
        history.add(affirmation)
    }

    fun showHistory() {
        println("🕒 Citations vues récemment")

        history.forEach {
            println("- ${it.text}")
        }
    }
}
