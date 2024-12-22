plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.akshayshopapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.akshayshopapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.google.firebase:firebase-auth:23.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation ("com.google.android.gms:play-services-auth:21.3.0")


    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // RxJava & RxAndroid
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava3:2.9.0")

    // ViewModel & LiveData
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1") // Latest version of Jetpack ViewModel

    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.5")
    implementation ("androidx.activity:activity-ktx:1.8.0")


    implementation ("com.github.bumptech.glide:glide:4.14.2")

    implementation ("com.intuit.ssp:ssp-android:1.1.0")
    implementation ("com.intuit.sdp:sdp-android:1.1.0")

    // Lottie dependency
    implementation ("com.airbnb.android:lottie:3.4.0")

    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    implementation ("org.jetbrains.kotlin:kotlin-parcelize-runtime:1.8.0")

    implementation ("com.razorpay:checkout:1.6.27")

    implementation ("com.facebook.android:facebook-login:latest.release")


    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    implementation ("androidx.room:room-ktx:2.6.1")


}