/**
 * Created by muratoter on 26,October,2022
 */

object ClassPaths {
    val gradle by lazy { "com.android.tools.build:gradle:${Versions.gradle}" }
    val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}" }
    val daggerHiltGradlePlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHilt}" }
    val navSafeArgsGradlePlugin by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}" }
}