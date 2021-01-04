package com.sirmeowingtons5.coffeecapsuletracker.domain.model

data class CapsuleInfo(
	val capsule: Capsule,
	val userPreference: CapsulePreference,
	val numberOwned: Int = 0
)