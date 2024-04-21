plugins {
    kotlin("plugin.noarg") version "1.9.23"
    kotlin("jvm") version "1.9.23"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withJavadocJar()
    withSourcesJar()
}

dependencies {
    //<editor-fold desc="Platform dependencies">
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.2.5"))
    //</editor-fold>

    //<editor-fold desc="Implementation dependencies">
    implementation("org.slf4j:slf4j-api")
    //</editor-fold>

    //<editor-fold desc="Runtime-only dependencies">
    //</editor-fold>

    //<editor-fold desc="Test implementation dependencies">
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.springframework.boot:spring-boot-test")
    //</editor-fold>

    //<editor-fold desc="Runtime-only dependencies">
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.springframework.boot:spring-boot-starter-test")
    //</editor-fold>
}

repositories {
    mavenCentral()
    mavenLocal()
}

kotlin {
    jvmToolchain {}
}

tasks.withType<Test> {
    useJUnitPlatform()
}

noArg {
    annotation("cinira.Model")
}
