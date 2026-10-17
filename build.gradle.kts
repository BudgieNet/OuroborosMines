plugins {
    id("com.budgienet.paper-plugin")
}

dependencies {
    compileOnly(libs.worldguard)
    compileOnly(libs.placeholderapi)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}
