package dependencies

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.provider.Provider

internal val VersionCatalog.versionKotlinCompiler: String
    get() = findVersionOrThrow("androidxKotlinCompiler")

internal val VersionCatalog.androidActivity: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-activity")

internal val VersionCatalog.fragmentKtx: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("fragment-ktx")

internal val VersionCatalog.navigationFragmentKtx: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("navigation-fragment-ktx")

internal val VersionCatalog.androidComposeBom: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-compose-bom")

internal val VersionCatalog.navigationUi: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("navigation-fragment-ktx")

internal val VersionCatalog.androidComposeUi: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-compose-ui")

internal val VersionCatalog.androidComposePreview: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-compose-preview")

internal val VersionCatalog.daggerHilt: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("dagget-hilt-compiler")

internal val VersionCatalog.androidComposeMaterial: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-compose-material3")

internal val VersionCatalog.androidFragment: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("fragment-android")

internal val VersionCatalog.androidLifecycle: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-lifecycle")

internal val VersionCatalog.libCoreKtx: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("core-ktx")

internal val VersionCatalog.testJunit: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("junit")

internal val VersionCatalog.androidTestJunit: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-junit")

internal val VersionCatalog.androidTestEspresso: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-espresso")

internal val VersionCatalog.lifecycleViewModelCompose: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-lifecycle-viewmodel-compose")
