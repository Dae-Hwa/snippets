plugins {
    idea
}

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "java")
}

idea.module {
    excludeDirs.addAll(allprojects.map { it.file("bin") })
}
