import dependencies.androidActivity
import dependencies.androidComposeMaterial
import dependencies.androidLifecycle
import dependencies.androidTestEspresso
import dependencies.androidTestJunit
import dependencies.libCoreKtx
import dependencies.libs
import dependencies.testJunit

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_17
        sourceCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
}

dependencies {
    implementation(libs.libCoreKtx)
    implementation(libs.androidLifecycle)
    implementation(libs.androidActivity)
    implementation(libs.androidComposeMaterial)
    testImplementation(libs.testJunit)
    androidTestImplementation(libs.androidTestJunit)
    androidTestImplementation(libs.androidTestEspresso)
}
