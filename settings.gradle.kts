pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "jetbrains-claude-subscription"

file("gradle.local.properties").takeIf { it.exists() }?.reader()?.use {
    java.util.Properties().apply { load(it) }.forEach { k, v -> System.setProperty(k.toString(), v.toString()) }
}
