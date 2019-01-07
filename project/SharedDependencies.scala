
object SharedDependencies extends DependenciesVersions {

  import play.sbt.PlayImport._
  import sbt._

  val resolvers = Seq(
    Resolver.jcenterRepo
  )

  val logback = "ch.qos.logback" % "logback-classic" % logbackVersion
  val log4j = "org.slf4j" % "slf4j-api" % log4jVersion

  val javaxInject = "javax.inject" % "javax.inject" % javaxInjectVersion

  val typesafeConfig = "com.typesafe" % "config" % typesafeConfigVersion

  val playJson = "com.typesafe.play" %% "play-json" % playVersion
  val playJsonExtra = "io.megl" %% "play-json-extra" % playJsonExtraVersion
  val playCore = "com.typesafe.play" %% "play" % playVersion


  val scalacheck: Seq[ModuleID] = Seq(
    "org.scalacheck" %% "scalacheck" % scalacheckVersion % Test
  )
  val scalatest: Seq[ModuleID] = Seq(
    "org.scalactic" %% "scalactic" % scalacticVersion % Compile,
    "org.mockito" % "mockito-all" % "1.8.4",
    "org.scalatest" %% "scalatest" % scalatestVersion % Test
  )

  val scalatestPlusPlay = Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % scalatestPlusPlayVersion % "test"
  )

}

trait DependenciesVersions {
  val logbackVersion = "1.1.3"
  val log4jVersion = "1.7.25"
  val typesafeConfigVersion = "1.2.1"
  val playVersion = play.core.PlayVersion.current
  val playJsonExtraVersion = "2.4.3"
  val javaxInjectVersion = "1"
  val scalacheckVersion = "1.13.4"
  val scalacticVersion = "3.0.1"
  val scalatestVersion = "3.0.1"
  val scalatestPlusPlayVersion = "3.1.2"

}