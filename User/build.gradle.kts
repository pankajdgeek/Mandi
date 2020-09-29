plugins{
    id(Plugin.dynamicFreature)
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

}

dependencies {
    implementation(project(":app"))
}