// scalaVersion := "2.11.11"

// enablePlugins(ScalaNativePlugin)
val sharedSettings = Seq(scalaVersion := "2.11.11")

lazy val bar =
  // (4) select supported platforms
  crossProject(JVMPlatform, NativePlatform)
    .settings(sharedSettings)
    // (5) configure JVM settings
    .jvmSettings(/* ... */)
    // (6) configure Scala-Native settings
    .nativeSettings(/* ... */) // defined in sbt-scala-native

lazy val barJVM    = bar.jvm
lazy val barNative = bar.native