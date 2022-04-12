pluginManagement {
    println("=== pluginManagement in root settings")

    apply(from = "build-logic-settings/pluginManagement-shared.settings.gradle.kts")

    includeBuild("build-logic-settings")
    includeBuild("build-logic")
}

plugins {
    id("convention-dependencies")
    id("convention-enterprise")
}

rootProject.name = "included-builds-playground"

include("app")
