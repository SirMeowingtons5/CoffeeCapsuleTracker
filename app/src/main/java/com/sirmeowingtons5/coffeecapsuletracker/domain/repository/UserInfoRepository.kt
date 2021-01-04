package com.sirmeowingtons5.coffeecapsuletracker.domain.repository

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.UserCapsuleData

interface UserInfoRepository {

    fun get(id: String): UserCapsuleData

    fun getOwned(): List<UserCapsuleData>

    fun getFavorite(): List<UserCapsuleData>

    fun updateCapsuleInfo(capsuleInfo: CapsuleInfo)
}