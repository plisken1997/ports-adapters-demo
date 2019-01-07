import com.typesafe.sbt.packager.SettingsHelper.makeDeploymentSettings

name := "functional ports & adapters demo"

scalafmtOnCompile in ThisBuild := true
scalafmtTestOnCompile in ThisBuild := true

lazy val commonSettings = Seq(
  scalaVersion in ThisBuild := "2.12.8",
  organization in ThisBuild := "org.plsk",
  sources in (Compile, doc) := Seq.empty,
  publishArtifact in (Compile, packageDoc) := false,
  publishArtifact in (Compile, packageSrc) := false,
  resolvers ++= SharedDependencies.resolvers
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .aggregate(playApi)
  .settings(run := {
    (run in playApi in Compile).evaluated
  })

lazy val core = (project in file("core"))
  .settings(commonSettings: _*)

lazy val playApi = (project in file("adapters/http/playApi"))
  .dependsOn(
    core % CompileAndTest
  )
  .enablePlugins(PlayScala, UniversalPlugin, JavaAppPackaging)
  .settings(commonSettings: _*)
  .settings(publishArtifact in (Test, packageBin) := true)
  .settings(makeDeploymentSettings(Universal, packageZipTarball in Universal, "tgz"))
