import dependencies.androidComposeBom
import dependencies.androidComposeMaterial
import dependencies.androidComposePreview
import dependencies.androidComposeUi
import dependencies.androidLifecycle
import dependencies.androidTestEspresso
import dependencies.androidTestJunit
import dependencies.fragmentKtx
import dependencies.libCoreKtx
import dependencies.libs
import dependencies.navigationFragmentKtx
import dependencies.navigationUi
import dependencies.testJunit

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion

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
    implementation(project(":common:ui"))
    implementation(libs.libCoreKtx)
    implementation(libs.androidLifecycle)
    implementation(libs.fragmentKtx)

    implementation(libs.androidComposeMaterial)
    implementation(libs.androidComposePreview)
    implementation(platform(libs.androidComposeBom))
    implementation(libs.androidComposeUi)

    implementation(libs.navigationUi)
    implementation(libs.navigationFragmentKtx)

    testImplementation(libs.testJunit)
    androidTestImplementation(libs.androidTestJunit)
    androidTestImplementation(libs.androidTestEspresso)
}
