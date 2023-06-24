rootProject.name = "worldguard"

include("worldguard-libs")
include("worldguard-libs:core")
include("worldguard-core")
//include("worldguard-libs:bukkit")
include("worldguard-bukkit")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.4.0")
}
