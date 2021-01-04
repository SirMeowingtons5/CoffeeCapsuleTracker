package com.sirmeowingtons5.coffeecapsuletracker.domain.usecase

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository

class GetFavoriteCapsulesUseCase(
    private val mapCapsuleDataToInfoUseCase: MapCapsuleDataToInfoUseCase,
	private val userInfoRepository: UserInfoRepository,
) {

    operator fun invoke(): List<CapsuleInfo> =
        mapCapsuleDataToInfoUseCase(userInfoRepository.getFavorite())
}