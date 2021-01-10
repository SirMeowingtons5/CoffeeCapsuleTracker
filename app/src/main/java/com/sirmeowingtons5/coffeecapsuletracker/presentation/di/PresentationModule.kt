package com.sirmeowingtons5.coffeecapsuletracker.presentation.di

import com.sirmeowingtons5.coffeecapsuletracker.presentation.CatalogueViewModel
import com.sirmeowingtons5.coffeecapsuletracker.presentation.DetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { CatalogueViewModel(get()) }
    viewModel { DetailsViewModel(get()) }
}