pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io" )}
        jcenter { content { includeModule("com.github.barteksc", "android-pdf-viewer") } }
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io" )}
        jcenter { content { includeModule("com.github.barteksc", "android-pdf-viewer") } }
        jcenter()
    }
}

rootProject.name = "Text To Speech"
include(":app")
 