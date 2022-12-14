pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Weather"
include(":app")
include(":navigation")
include(":ui-login")
include(":ui-dashboard")
include(":data")
include(":domain")
include(":core-common")
