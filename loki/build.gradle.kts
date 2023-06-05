plugins {
    id("java")
}

group = "dae-hwa.snippets-examples"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    /** loki **/
    implementation("com.github.loki4j:loki-logback-appender:1.4.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}