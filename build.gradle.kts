plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // Add the dependency for the Google services Gradle plugin
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false

}
buildscript {
    repositories {
        google()
    }
    dependencies {


        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("com.android.tools.build:gradle:8.1.0")
    }
}