// Enable `assembly` command.
//import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  // ScalaLogging
  //"com.typesafe" %% "scalalogging-slf4j" % "1.1.0",
  //"org.slf4j" % "slf4j-api" % "1.7.7",
  //"ch.qos.logback" % "logback-classic" % "1.1.2"

  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

// Enable `assembly` command.
//assemblySettings
