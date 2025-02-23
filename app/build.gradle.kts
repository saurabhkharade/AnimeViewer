plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.saurabhkharade.animeviewer"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.saurabhkharade.animeviewer"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "20"
    }


    buildFeatures{
        viewBinding= true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")


    // Kotlin Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

// Retrofit & Gson
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

// Dagger-Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt ("com.google.dagger:hilt-compiler:2.50")

// ViewModel & LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")

// DataBinding (enabled automatically in new projects)
    implementation ("androidx.databinding:databinding-runtime:8.8.0")

}