name := """playwithFlutter"""
organization := "bnb"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "bnb.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "bnb.binders._"
