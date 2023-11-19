package dependencies

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.provider.Provider

internal val VersionCatalog.versionKotlinCompiler: String
    get() = findVersionOrThrow("androidxKotlinCompiler")

internal val VersionCatalog.androidActivity: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-activity")

internal val VersionCatalog.androidComposeMaterial: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("android-compose-material3")
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
