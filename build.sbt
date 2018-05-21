name := "sbt-kotlin"
organization := "me.aki.sbt"
version := "1.0.9"

scalacOptions ++= Seq("-deprecation","-Xlint","-feature")

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.23"

sbtPlugin := true
