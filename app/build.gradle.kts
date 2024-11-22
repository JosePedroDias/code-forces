plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

repositories {
    mavenCentral()
}

dependencies {
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("2.0.0")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    //mainClass = "org.cw1157a.MainKt" // OK
    //mainClass = "org.cw2037a.MainKt" // OK
    //mainClass = "org.cw2037b.MainKt" // OK
    mainClass = "org.cw2037d.MainKt" // TODO
    //mainClass = "org.cw2037c.MainKt" // NOK! TODO (complex cases?)
    //mainClass = "org.cw2037e.MainKt" // TODO
}

// required if we want the app to get stdin
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
