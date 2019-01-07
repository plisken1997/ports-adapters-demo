resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

//The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
