name := """setu-biller-api-hosting"""
organization := "setu.co"
version := "1.0-SNAPSHOT"


scalaVersion := "2.12.8"
val playVersion = "2.7.0"

libraryDependencies ++= Seq(
  guice,
  filters,
  "org.postgresql" % "postgresql" % "42.2.5",

  "com.typesafe.slick" %% "slick" % "3.2.3" withSources(),
  "com.typesafe.play" %% "play-slick" % "3.0.0" withSources() withJavadoc(),

  "com.typesafe.play" %% "play-json" % playVersion withSources()


  //"joda-time" % "joda-time" % "2.8.1",
  //"com.typesafe.play" %% "play-ws" % playVersion withSources(),
  //"com.typesafe.play" %% "play-json" % playVersion withSources(),

)
scalacOptions ++= Seq("-deprecation", "-feature")