package com.sirmeowingtons5.coffeecapsuletracker.domain.model

data class Capsule(
	val id: String,
	val title: String,
	val annotation: String,
	val description: String,
	val collection: String,
	val country: String?,
	val aromaticProfile: String?,
	val coffeeSystem: CoffeeSystem,
	val intensity: Int,
	val cupSize: List<CupSize>,
	val capsuleImageLink: String,
	val backgroundImageLink: String,
) {
    companion object {
        val DEFAULT = Capsule(
			id = "DEFAULT_STUB",
			title = "UNKNOWN",
			annotation = "",
			description = "",
			collection = "",
			country = null,
			aromaticProfile = null,
			coffeeSystem = CoffeeSystem.ORIGIN,
			intensity = 0,
			cupSize = emptyList(),
			capsuleImageLink = "",
			backgroundImageLink = ""
		)
        const val MAX_INTENSITY = 13
    }
}