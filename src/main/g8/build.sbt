// Enable `assembly` command.
//import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.4"

// crossScalaVersions := Seq("2.10.4", "2.11.4")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  // ScalaLogging
  //"com.typesafe" %% "scalalogging-slf4j" % "1.1.0",
  //"org.slf4j" % "slf4j-api" % "1.7.7",
  //"ch.qos.logback" % "logback-classic" % "1.1.2"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

// Enable `assembly` command.
//assemblySettings
