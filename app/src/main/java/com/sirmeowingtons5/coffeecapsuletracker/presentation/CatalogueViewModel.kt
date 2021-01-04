package com.sirmeowingtons5.coffeecapsuletracker.presentation

import androidx.lifecycle.ViewModel
import com.sirmeowingtons5.coffeecapsuletracker.domain.usecase.GetAllCapsulesUseCase

class CatalogueViewModel(
    private val getAllCapsulesUseCase: GetAllCapsulesUseCase
) : ViewModel() {

    val capsules = getAllCapsulesUseCase()
}