name := "checkout"

version := "0.1"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.9" % Test)

scalacOptions in Test ++= Seq("-Yrangepos")
    