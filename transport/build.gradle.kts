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
}

dependencies {
    api(project(":app"))
}