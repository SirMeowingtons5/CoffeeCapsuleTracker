package com.sirmeowingtons5.coffeecapsuletracker.domain.di

import com.sirmeowingtons5.coffeecapsuletracker.domain.usecase.*
import org.koin.dsl.module

val domainModule = module {
    single { GetAllCapsulesUseCase(get(), get()) }
    single { GetFavoriteCapsulesUseCase(get(), get()) }
    single { GetOwnedCapsulesUseCase(get(), get()) }
    single { UpdateCapsuleDataUseCase(get()) }
    single { MapCapsuleDataToInfoUseCase(get()) }
}