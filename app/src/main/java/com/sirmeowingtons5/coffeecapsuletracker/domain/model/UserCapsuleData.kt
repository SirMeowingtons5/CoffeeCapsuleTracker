package com.sirmeowingtons5.coffeecapsuletracker.domain.model

data class UserCapsuleData(
	val id: String,
	val preference: CapsulePreference = CapsulePreference.NONE,
	val numberOwned: Int = 0
)