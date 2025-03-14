import org.gradle.internal.impldep.com.google.common.collect.FluentIterable.from
import org.gradle.internal.impldep.org.apache.http.entity.ContentType.create

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    };


        rootProject.name = "City"
include(":app")}
 