package com.sirmeowingtons5.coffeecapsuletracker.buildsrc

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha03"
    const val junit = "junit:junit:4.13"

    object Accompanist {
        private const val version = "0.4.1"
        const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:$version"
    }

    object Kotlin {
        private const val version = "1.4.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.4.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Koin {
        private const val version = "2.2.2"
        const val core = "org.koin:koin-android:$version"
        const val viewModel = "org.koin:koin-androidx-viewmodel:$version"
        const val compose = "org.koin:koin-androidx-compose:$version"
        const val scope = "org.koin:koin-androidx-scope:$version"
        const val ext = "org.koin:koin-androidx-ext:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.5.0-alpha05"

        object Compose {
            private const val version = "1.0.0-alpha09"
            private const val navigationVersion = "1.0.0-alpha04"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val material = "androidx.compose.material:material:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"

            const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"
        }

        object Test {
            private const val version = "1.2.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2-rc01"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }
}
