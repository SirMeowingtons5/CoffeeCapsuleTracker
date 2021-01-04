package com.sirmeowingtons5.coffeecapsuletracker.domain.usecase

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.UserCapsuleData
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.CapsuleRepository

class MapCapsuleDataToInfoUseCase(
    private val repository: CapsuleRepository
) {

    operator fun invoke(data: List<UserCapsuleData>): List<CapsuleInfo> =
        data.map { userCapsuleData ->
            val capsule = repository.get(userCapsuleData.id)

            CapsuleInfo(
                capsule = capsule,
                userPreference = userCapsuleData.preference,
                numberOwned = userCapsuleData.numberOwned
            )
        }
}