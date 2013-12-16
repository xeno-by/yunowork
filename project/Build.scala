import sbt._
import Keys._

object MyBuild extends Build {
  lazy val root: Project = Project(
    "root",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      scalaVersion := "2.11.0-M7",
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _)
    )
  )
}
