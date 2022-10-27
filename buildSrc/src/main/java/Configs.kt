/**
 * Created by muratoter on 26,October,2022
 */


object Configs {
    const val compileSdk = 33
    const val applicationId = "com.moter.weather"
    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1

    // App Version
    const val MAJOR = 1
    const val MINOR = 0
    const val PATCH = 0

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    fun getVersionName(): String {
        return "$MAJOR.$MINOR.$PATCH"
    }
}