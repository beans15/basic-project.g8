// Enable `assembly` command.
//import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test"

  // ScalaLogging
  //"com.typesafe" %% "scalalogging-slf4j" % "1.0.0",
  //"org.slf4j" % "slf4j-api" % "1.7.1",
  //"ch.qos.logback" % "logback-classic" % "1.0.7"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

// Enable `assembly` command.
//assemblySettings
