package com.example.khallikdimazen

class SettingsScreen {

    var notificationsEnabled: Boolean = true

    var reminderHour: Int = 9

    var darkModeEnabled: Boolean = false

    fun toggleNotifications() {
        notificationsEnabled = !notificationsEnabled
    }

    fun toggleDarkMode() {
        darkModeEnabled = !darkModeEnabled
    }

    fun updateReminderHour(hour: Int) {
        reminderHour = hour
    }
}
