package com.example.khallikdimazen

import kotlin.random.Random

class AffirmationRepository {

    private val affirmations = listOf(
        Affirmation(1, "بشوية عليك... راك غادي مزيان 💜"),
        Affirmation(2, "نهار جديد فرصة جديدة"),
        Affirmation(3, "راه حتى الراحة إنجاز"),
        Affirmation(4, "خدي نفس وكملي خطوة بخطوة"),
        Affirmation(5, "ما خاصكش تكوني كاملة باش تبداي")
    )

    fun getAllAffirmations(): List<Affirmation> {
        return affirmations
    }

    fun getRandomAffirmation(): Affirmation {
        return affirmations[Random.nextInt(affirmations.size)]
    }
}
