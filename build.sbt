name := "airframe-http-example"

version := "0.1"

scalaVersion := "2.12.6"

val AIRFRAME_VERSION = "0.66"

libraryDependencies ++= Seq(
  "org.wvlet.airframe"      %% "airframe-http"         % AIRFRAME_VERSION,
  "org.wvlet.airframe"      %% "airframe-http-finagle" % AIRFRAME_VERSION,
  "org.wvlet.airframe"      %% "airframe"              % AIRFRAME_VERSION
)