plugins {
    java
    idea
}

repositories {
    mavenCentral()
}

allprojects {
    group = "dae-hwa.snippets-examples"
}

idea.module {
    excludeDirs.addAll(allprojects.map { it.file("bin") })
}
