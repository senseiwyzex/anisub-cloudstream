dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

version = 1

cloudstream {
    description = "AniSub Turkish Subtitle Provider"

    authors = listOf(
        "Wyzex"
    )

    status = 1

    tvTypes = listOf(
        "Anime"
    )

    requiresResources = true

    language = "tr"

    iconUrl = "https://anisub.co/favicon.ico"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}