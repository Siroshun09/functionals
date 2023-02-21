pluginManagement {
    includeBuild("build-logic")

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "functionals"

sequenceOf(
    "core"
).forEach {
val projectName = "${rootProject.name}-$it"
    include(projectName)
    project(":$projectName").projectDir = file(it)
}
