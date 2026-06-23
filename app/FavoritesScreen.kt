package com.example.khallikdimazen

class FavoritesScreen {

    private val favorites = mutableListOf<Affirmation>()

    fun addFavorite(affirmation: Affirmation) {
        favorites.add(affirmation)
    }

    fun getFavorites(): List<Affirmation> {
        return favorites
    }
}
