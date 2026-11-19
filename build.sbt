val common = Def.settings(
  scalaVersion := "3.10.1"
)

autoScalaLibrary := false

val lib_a_v1 = project.settings(
  common,
  name := "lib",
  version := "0.1",
)

val lib_a_v2 = project.settings(
  common,
  name := "lib",
  version := "0.2",
)

val lib_b = project.settings(common).dependsOn(lib_a_v1 % Provided)

val app = project.settings(common).dependsOn(lib_b, lib_a_v2)
