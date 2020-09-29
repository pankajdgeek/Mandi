object App{
    const val compileSdkVersion = 29
    const val buildToolsVersion ="29.0.3"
    const val applicationId = "com.pankaj.mandi"
    const val minSdkVersion =16
    const val targetSdkVersion= 29
    const val versionCode =1
    const val versionName ="1.0"
}

object Versions {
    const val kotlin = "1.4.0"
    const val androidxCore = "1.3.1"
    const val junit = "4.12"
    const val testJunit = "1.1.2"
    const val espresso = "3.3.0"
    const val appcompat = "1.2.0"
    const val constraint = "2.0.1"
    const val build ="4.0.1"
    const val kotlinGradle="1.4.0"
}

object Dependencies {
    const val kotlinStbLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val junit = "junit:junit:${Versions.junit}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val testJunit = "androidx.test.ext:junit:${Versions.testJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

}

object Classpath{
    const val build ="com.android.tools.build:gradle:${Versions.build}"
    const val kotlinGradle="org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradle}"
}

object Plugin{
    const val androidApplication="com.android.application"
    const val kotlinAndroid ="kotlin-android"
    const val kotlinAndroidExt ="kotlin-android-extensions"
    const val dynamicFreature ="com.android.dynamic-feature"
}