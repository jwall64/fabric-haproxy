pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
    }
    includeBuild("gradle/plugins")
}

rootProject.name = "fabric-haproxy"

