package com.sirmeowingtons5.coffeecapsuletracker.domain.repository

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.Capsule

interface CapsuleRepository {

    fun get(id: String): Capsule

    fun getAll(): List<Capsule>
}