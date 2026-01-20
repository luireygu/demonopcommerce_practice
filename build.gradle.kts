plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.cucumber:cucumber-java:7.15.0")

    // CUCUMBER + JUNIT 5 (Motor y Suite para el Runner)
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.15.0")
    testImplementation("org.junit.platform:junit-platform-suite:1.10.0")

    // JUNIT 5 API
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    // SELENIUM
    testImplementation("org.seleniumhq.selenium:selenium-java:4.16.1")

    // UTILIDADES
    testImplementation("io.github.bonigarcia:webdrivermanager:5.6.3")
    testImplementation("org.apache.commons:commons-lang3:3.14.0")

    testImplementation ("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()

    // Reenviar tags de Cucumber a la JVM de tests
    systemProperty(
        "cucumber.filter.tags",
        System.getProperty("cucumber.filter.tags")
    )

    testLogging {
        events("passed", "failed", "skipped")
    }
}