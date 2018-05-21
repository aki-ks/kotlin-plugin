name := "kotlin-plugin"
organization := "com.hanhuy.sbt"
version := "1.0.8"

scalacOptions ++= Seq("-deprecation","-Xlint","-feature")

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.23"

sbtPlugin := true
