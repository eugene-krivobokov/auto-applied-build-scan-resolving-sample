// ==================================================================================================
// We apply this script inside `pluginManagement` block.
// It's done to configure `pluginManagement.repositories` _before_ applying the first plugin from included builds.
// `pluginManagement.repositories` are used to resolve dependencies of plugins from included builds.
// Using convention plugins to configure repositories is a chicken and egg problem.
// The first applied plugin would require already configured `pluginManagement.repositories` itself.
// `pluginManagement` and `plugins` blocks are evaluated before anything in a buildscript.
// ==================================================================================================

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
