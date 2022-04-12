rootProject.name = "build-logic-settings"

include("dependencies")
include("scan")

pluginManagement {
    println("=== pluginManagement in build-logic-settings")
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
