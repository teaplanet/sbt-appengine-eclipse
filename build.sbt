name := "sample"

version := "1.0.0"

scalaVersion := "2.9.1"

organization := "teaplanet"

// for Specs2
resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
				"releases" at "http://scala-tools.org/repo-releases",
				"releases" at "http://repo1.maven.org/maven2/")

libraryDependencies ++= {
	val appEngineVersion = "1.5.5"
	Seq(
		"com.google.appengine" % "appengine-api-1.0-sdk" % appEngineVersion,
		"com.google.appengine" % "appengine-api-stubs" % appEngineVersion % "test",
		"com.google.appengine" % "appengine-api-labs" % appEngineVersion % "test",
		"com.google.appengine" % "appengine-testing" % appEngineVersion % "test",
		"com.google.appengine" % "appengine-tools-sdk" % appEngineVersion % "test",
		"org.specs2" %% "specs2" % "1.6.1" % "test",
		"org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test",
		"junit" % "junit" % "4.9" % "test"
	)
}
