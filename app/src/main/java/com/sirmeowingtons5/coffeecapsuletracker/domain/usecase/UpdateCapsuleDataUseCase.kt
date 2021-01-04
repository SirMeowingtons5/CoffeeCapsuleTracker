package com.sirmeowingtons5.coffeecapsuletracker.domain.usecase

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository

class UpdateCapsuleDataUseCase(private val repository: UserInfoRepository) {

    operator fun invoke(new: CapsuleInfo) {
        repository.updateCapsuleInfo(new)
    }
}