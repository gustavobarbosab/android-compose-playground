plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.google.ksp)
    alias(libs.plugins.dagger.hilt)
}

android {
    namespace = "com.github.gustavobarbosab.movietime"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.github.gustavobarbosab.movietime"
        minSdk = 23
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    dynamicFeatures += setOf(":feature:detail:presentation")
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.android.lifecycle)
    implementation(libs.android.activity)
    implementation(platform(libs.android.compose.bom))
    implementation(libs.android.compose.ui)
    implementation(libs.android.compose.graphics)
    implementation(libs.android.compose.preview)
    implementation(libs.android.compose.material3)

    implementation(libs.dagger.hilt.android)
    ksp(libs.dagger.hilt.compiler)

    testImplementation(libs.junit)
    androidTestImplementation(libs.android.junit)
    androidTestImplementation(libs.android.espresso)
    androidTestImplementation(platform(libs.android.compose.bom.test))
    androidTestImplementation(libs.android.compose.test)
}