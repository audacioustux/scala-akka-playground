scalaVersion := "2.13.3"
name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

val AkkaVersion = "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
