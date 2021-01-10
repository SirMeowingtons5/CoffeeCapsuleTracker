package com.sirmeowingtons5.coffeecapsuletracker.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.domain.usecase.GetCapsuleInfoUseCase

class DetailsViewModel(
    private val getCapsuleInfoUseCase: GetCapsuleInfoUseCase
) : ViewModel() {

    var capsuleInfo: CapsuleInfo? by mutableStateOf(null)
        private set

    fun loadCapsuleInfo(id: String) {
        capsuleInfo = getCapsuleInfoUseCase(id)
    }
}