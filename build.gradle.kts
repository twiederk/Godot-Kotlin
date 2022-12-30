plugins {
    id("com.utopia-rise.godot-kotlin-jvm") version "0.5.1-3.5.1"
}

repositories {
    mavenCentral()
    mavenLocal()
}

godot {
    isAndroidExportEnabled.set(false)
    d8ToolPath.set(File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/31.0.0/d8"))
    androidCompileSdkDir.set(File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"))
}

dependencies {
//    implementation("com.d20charactersheet:framework:4.11.0")

    implementation("org.assertj:assertj-core:3.22.0")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
}