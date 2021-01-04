package com.sirmeowingtons5.coffeecapsuletracker.data.di

import com.sirmeowingtons5.coffeecapsuletracker.data.datasource.CapsuleDataSource
import com.sirmeowingtons5.coffeecapsuletracker.data.datasource.UserInfoDataSource
import com.sirmeowingtons5.coffeecapsuletracker.data.repository.CapsuleRepositoryImpl
import com.sirmeowingtons5.coffeecapsuletracker.data.repository.UserInfoRepositoryImpl
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.CapsuleRepository
import com.sirmeowingtons5.coffeecapsuletracker.domain.repository.UserInfoRepository
import org.koin.dsl.module

val dataModule = module {
    single { CapsuleDataSource() }
    single { UserInfoDataSource() }

    single<CapsuleRepository> { CapsuleRepositoryImpl(get()) }
    single<UserInfoRepository> { UserInfoRepositoryImpl(get()) }
}