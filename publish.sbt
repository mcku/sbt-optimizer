publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else                  Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra :=
  Helpers.generatePomExtra("git@github.com:jrudolph/sbt-optimizer.git",
                           "scm:git:git@github.com:jrudolph/sbt-optimizer.git",
                           "jrudolph", "Johannes Rudolph")

useGpg := true
