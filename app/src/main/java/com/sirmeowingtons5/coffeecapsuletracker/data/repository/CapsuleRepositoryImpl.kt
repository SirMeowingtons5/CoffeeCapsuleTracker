package com.sirmeowingtons5.coffeecapsuletracker.data.repository

import com.sirmeowingtons5.coffeecapsuletracker.data.datasource.CapsuleDataSource
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.Capsule
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.CapsuleRepository

class CapsuleRepositoryImpl(
	private val dataSource: CapsuleDataSource
) : CapsuleRepository {

    override fun get(id: String): Capsule =
        dataSource.get(id) ?: Capsule.DEFAULT

    override fun getAll(): List<Capsule> =
        dataSource.getAll()
}