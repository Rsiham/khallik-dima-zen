
package com.example.khallikdimazen

import kotlin.random.Random

fun main() {
    val affirmations = listOf(
        "بشوية عليك، راك غادي مزيان 💜",
        "نهار جديد، فرصة جديدة",
        "ما خاصكش تكوني كاملة باش تبداي",
        "خدي نفس وكملي خطوة بخطوة",
        "راه حتى الراحة إنجاز"
    )

    val affirmation = affirmations[Random.nextInt(affirmations.size)]

    println("📱 Khallik Dima Zen")
    println("رسالة اليوم:")
    println(affirmation)
}
