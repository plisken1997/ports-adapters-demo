import SharedDependencies._

name := "play-api"

libraryDependencies ++= Seq(guice, filters, javaxInject, typesafeConfig) ++ scalatest ++ scalatestPlusPlay

routesGenerator := InjectedRoutesGenerator
