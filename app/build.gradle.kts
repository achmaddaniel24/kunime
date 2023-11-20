plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
	id("com.google.gms.google-services")
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
		kotlinCompilerExtensionVersion = "1.5.4"
	}
	
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	// Platform
	implementation(platform("androidx.compose:compose-bom:2022.10.00"))
	implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
	implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
	
	// Google Service
	implementation("com.google.firebase:firebase-storage")
	implementation("com.google.firebase:firebase-firestore")
	
	// Jetpack Compose
	implementation("androidx.compose.ui:ui-tooling-preview")
	implementation("androidx.compose.ui:ui-graphics")
	implementation("androidx.compose.ui:ui")
	implementation("androidx.compose.material3:material3:1.1.2")
	
	// AndroidX
	implementation("androidx.activity:activity-compose:1.5.1")
	implementation("androidx.core:core-ktx:1.8.0")
	implementation("androidx.core:core-splashscreen:1.0.1")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
	implementation("androidx.navigation:navigation-compose:2.7.5")
	
	// Debugging Tools
	debugImplementation("androidx.compose.ui:ui-tooling")
	debugImplementation("androidx.compose.ui:ui-test-manifest")
}