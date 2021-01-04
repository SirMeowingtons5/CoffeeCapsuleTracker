package com.sirmeowingtons5.coffeecapsuletracker.ui

import android.app.Application
import com.sirmeowingtons5.coffeecapsuletracker.data.di.dataModule
import com.sirmeowingtons5.coffeecapsuletracker.domain.di.domainModule
import com.sirmeowingtons5.coffeecapsuletracker.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(presentationModule, domainModule, dataModule)
        }
    }
}