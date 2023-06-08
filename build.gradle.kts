plugins {
    idea
}

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
}

idea.module {
    excludeDirs.addAll(allprojects.map { it.file("bin") })
}
