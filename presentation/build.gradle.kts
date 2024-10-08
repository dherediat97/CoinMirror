plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.nextlevel.coinmirror.presentation"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(project(":domain"))
    api(project(":data"))
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.ui)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.ui.tooling)
    api(libs.androidx.ui.tooling.preview)
    api(libs.androidx.material3)
    api(libs.androidx.material.icons.extended)
    api(libs.androidx.activity.compose)
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.lifecycle.runtime.ktx)
    api(libs.androidx.lifecycle.viewmodel.compose)
    api(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    api(libs.androidx.navigation.compose)
    api(libs.androidx.hilt.navigation.compose)
    api(libs.lottie.compose)
}