plugins {
    id(Plugin.androidApplication)
    id(Plugin.kotlinAndroid)
    id(Plugin.kotlinAndroidExt)
}

android {
    compileSdkVersion(App.compileSdkVersion)
    buildToolsVersion = App.buildToolsVersion

    defaultConfig {
        minSdkVersion(App.minSdkVersion)
        targetSdkVersion(App.targetSdkVersion)
        versionCode = App.versionCode
        versionName = App.versionName

//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(
                "proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility=JavaVersion.VERSION_1_8
        targetCompatibility=JavaVersion.VERSION_1_8
    }
    flavorDimensions("version")
    productFlavors{
        create("user"){
            setDimension("version")
            applicationId = "com.pankaj.user"
            resValue("string","app_name","eMarket")

        }
        create("partner"){
            setDimension("version")
            applicationId ="com.pankaj.partner"
            resValue("string","app_name","eMarket Partner")
        }

    }

    dynamicFeatures= mutableSetOf(":User",":transport")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlinStbLib)
    implementation(Dependencies.androidxCore)
    api(Dependencies.appcompat)
    api(Dependencies.constraint)
//    networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
//    ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

//    dependency injection
    // Koin AndroidX Scope features
    api ("org.koin:koin-androidx-scope:${Versions.koin}")
//// Koin AndroidX ViewModel features
    api ("org.koin:koin-androidx-viewmodel:${Versions.koin}")
//// Koin AndroidX Fragment features
    api ("org.koin:koin-androidx-fragment:${Versions.koin}")

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.testJunit)
    androidTestImplementation(Dependencies.espresso)

}