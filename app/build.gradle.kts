plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
}

android {
	namespace = "com.achmaddaniel.kunime"
	compileSdk = 34
	buildToolsVersion = "34.0.0"
	
	defaultConfig {
		applicationId = "com.achmaddaniel.kunime"
		minSdk = 21
		targetSdk = 34
		versionCode = 1
		versionName = "1.0.0"
		
		vectorDrawables {
			useSupportLibrary = true
		}
	}
	
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_19
		targetCompatibility = JavaVersion.VERSION_19
	}
	
	buildTypes {
		release {
			isMinifyEnabled = true
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	
	buildFeatures {
		compose = true
	}
	
	kotlinOptions {
		jvmTarget = "19"
	}
	
	composeOptions {
		kotlinCompilerExtensionVersion = "1.5.8"
	}
	
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	// Platform
	implementation(platform("androidx.compose:compose-bom:2023.10.01"))
	implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
	
	// API Service
	implementation("io.coil-kt:coil-compose:2.5.0")
	implementation("com.squareup.retrofit2:retrofit:2.9.0")
	implementation("com.squareup.retrofit2:converter-gson:2.9.0")
	implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
	
	// Jetpack Compose
	implementation("androidx.compose.ui:ui-graphics:1.6.0-alpha08")
	implementation("androidx.compose.ui:ui:1.6.0-alpha08")
	implementation("androidx.compose.material3:material3:1.1.2")
	
	// AndroidX
	implementation("androidx.activity:activity-compose")
	implementation("androidx.core:core-ktx:1.12.0")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
	
	// Kotlin Coroutine
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0-RC2")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC2")
	
	// Debugging Tools
	implementation("androidx.compose.ui:ui-tooling-preview")
	debugImplementation("androidx.compose.ui:ui-tooling")
	debugImplementation("androidx.compose.ui:ui-test-manifest")
}