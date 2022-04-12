plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.20"
    application
    id("convention-sample")
}

application {
    mainClass.set("example.app.AppKt")
}
