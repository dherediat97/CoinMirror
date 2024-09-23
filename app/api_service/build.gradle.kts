plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.nextlevel.coinmirror.apiservice"
    compileSdk = 34


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    api(project(":data"))
    api(libs.retrofit)
    api(libs.retrofit.converter.gson)
}