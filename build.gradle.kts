plugins {
    java
    jacoco
    pmd
    id("com.diffplug.spotless") version "6.17.0"
    id("com.adarshr.test-logger") version "3.2.0"
}

group = "com.yqmonline"
version = "1.0-SNAPSHOT"
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
repositories {
    mavenCentral()
}




dependencies {
    /* Versions */
    val lombokVersion = "1.18.26"
    val jUnitVersion = "5.9.2"

    // Lombok
    compileOnly("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")
    testCompileOnly("org.projectlombok:lombok:${lombokVersion}")
    testAnnotationProcessor("org.projectlombok:lombok:${lombokVersion}")

    // JUNIT
    testImplementation("org.junit.jupiter:junit-jupiter-api:${jUnitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${jUnitVersion}")

    // Mockito
    testImplementation("org.mockito:mockito-core:3.+")
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        cleanthat()

        googleJavaFormat("1.16.0")

        formatAnnotations()

        licenseHeader("/** Created By AustinYQM **/")
    }
}

tasks.compileJava {
    dependsOn(tasks.spotlessApply)
}

tasks.compileTestJava {
    dependsOn(tasks.spotlessApply)
}

tasks.jacocoTestReport { dependsOn(tasks.test) }

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = "0.5".toBigDecimal()
            }
        }
    }
}


tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}
