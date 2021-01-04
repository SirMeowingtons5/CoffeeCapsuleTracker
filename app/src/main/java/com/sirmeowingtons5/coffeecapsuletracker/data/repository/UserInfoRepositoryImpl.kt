package com.sirmeowingtons5.coffeecapsuletracker.data.repository

import com.sirmeowingtons5.coffeecapsuletracker.data.datasource.UserInfoDataSource
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.UserCapsuleData
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository

class UserInfoRepositoryImpl(
	private val dataSource: UserInfoDataSource
) : UserInfoRepository {

    override fun get(id: String): UserCapsuleData =
        dataSource
            .getById(id)
            ?: UserCapsuleData(id = id)

    override fun getOwned(): List<UserCapsuleData> =
        dataSource.getOwned()

    override fun getFavorite(): List<UserCapsuleData> =
        dataSource.getFavorites()

    override fun updateCapsuleInfo(capsuleInfo: CapsuleInfo) {
        dataSource.update(
			UserCapsuleData(
				id = capsuleInfo.capsule.id,
				preference = capsuleInfo.userPreference,
				numberOwned = capsuleInfo.numberOwned
			)
		)
    }
}