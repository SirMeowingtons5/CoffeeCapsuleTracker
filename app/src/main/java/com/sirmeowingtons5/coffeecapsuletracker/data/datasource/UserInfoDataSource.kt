package com.sirmeowingtons5.coffeecapsuletracker.data.datasource

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsulePreference
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.UserCapsuleData

class UserInfoDataSource {

    //TODO: Add DB support
    private val localCapsuleData: HashMap<String, UserCapsuleData> = HashMap()

    fun getById(capsuleId: String): UserCapsuleData? =
        localCapsuleData[capsuleId]

    fun getFavorites(): List<UserCapsuleData> =
        localCapsuleData
            .filterValues { it.preference == CapsulePreference.FAVORITE }
            .values
            .toList()

    fun getOwned(): List<UserCapsuleData> =
        localCapsuleData
            .filterValues { it.numberOwned > 0 }
            .values
            .toList()

    fun update(data: UserCapsuleData) {
        localCapsuleData[data.id] = data
    }
}