rootProject.name = "build-logic"

include("conventions")

pluginManagement {
    println("=== pluginManagement in build-logic")

    apply(from = "../build-logic-settings/pluginManagement-shared.settings.gradle.kts")

    includeBuild("../build-logic-settings")
}

plugins {
    id("convention-dependencies")
}
