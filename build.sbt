ThisBuild / scalaVersion := "3.2.1"

lazy val hello = (project in file("."))
  .enablePlugins(ScalaJSPlugin, ScalablyTypedConverterPlugin)
  .settings(
    name := "Scala.js Tutorial",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.8.1" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework"),
    Compile / npmDependencies ++= Seq(
      "@types/node" -> "18.11.18"
    ),
    stOutputPackage := "typings"
  )

