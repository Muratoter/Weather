/**
 * Created by muratoter on 26,October,2022
 */

object Dependencies {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val navigation by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}" }
    val navigationUiKtx by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.navigation}" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}" }
    val daggerHilt by lazy { "com.google.dagger:hilt-android:${Versions.daggerHilt}" }
    val daggerHiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.daggerHilt}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }

    val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
    val jUnitExt by lazy { "androidx.test.ext:junit:${Versions.jUnitExt}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
}
