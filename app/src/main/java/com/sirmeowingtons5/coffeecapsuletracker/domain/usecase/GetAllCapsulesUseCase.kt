package com.sirmeowingtons5.coffeecapsuletracker.domain.usecase

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.CapsuleRepository
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository

class GetAllCapsulesUseCase(
	private val capsuleRepository: CapsuleRepository,
	private val userInfoRepository: UserInfoRepository
) {

    operator fun invoke(): List<CapsuleInfo> =
        capsuleRepository.getAll()
            .map { capsule ->
                val userPreference = userInfoRepository.get(capsule.id)

                CapsuleInfo(
					capsule = capsule,
					userPreference = userPreference.preference,
					numberOwned = userPreference.numberOwned
				)
            }
}