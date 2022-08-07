plugins {
    id("java")
}

group = "org.acaldwell"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.sparkjava:spark-core:2.9.4")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}