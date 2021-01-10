package com.sirmeowingtons5.coffeecapsuletracker.domain.usecase

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.CapsuleRepository
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository

class GetCapsuleInfoUseCase(
    private val capsuleRepository: CapsuleRepository,
    private val userInfoRepository: UserInfoRepository
) {

    operator fun invoke(id: String) : CapsuleInfo {
        val capsule = capsuleRepository.get(id)
        val userInfo = userInfoRepository.get(id)

        return CapsuleInfo(
            capsule = capsule,
            userPreference = userInfo.preference,
            numberOwned = userInfo.numberOwned
        )
    }
}