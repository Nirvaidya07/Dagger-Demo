plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlin")
    id("kotlin-kapt")
}

dependencies {
    implementation(project(":dagger"))
    implementation("com.squareup:kotlinpoet:1.14.2")
}