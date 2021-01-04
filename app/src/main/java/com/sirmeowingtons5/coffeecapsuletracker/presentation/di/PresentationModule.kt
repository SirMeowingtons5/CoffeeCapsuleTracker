package com.sirmeowingtons5.coffeecapsuletracker.presentation.di

import com.sirmeowingtons5.coffeecapsuletracker.presentation.CatalogueViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { CatalogueViewModel(get()) }
}