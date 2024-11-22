plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

repositories {
    mavenCentral()
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest()
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

sourceSets {
    getByName("main") {
        kotlin.srcDirs("src")
    }
    getByName("test") {
        kotlin.srcDirs("test")
    }
}

application {
    mainClass = "MainKt"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
