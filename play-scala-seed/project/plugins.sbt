//conflictManager := ConflictManager.strict
//addSbtCoursier

// libraryDependencies += "org.webjars.npm" % "jshint" % "2.9.3" force()
// libraryDependencies += "org.webjars.npm" % "entities" % "1.0.0" force()
// libraryDependencies += "org.webjars.npm" % "dom-serializer" % "0.1.1" force()
// libraryDependencies += "org.webjars.npm" % "domutils" % "1.5.1"
// libraryDependencies += "org.webjars.npm" % "domutils" % "1.5.0"
// libraryDependencies += "org.webjars.npm" % "readable-stream" % "1.1.14" force()
// libraryDependencies += "org.webjars.npm" % "htmlparser2" % "3.8.3" force()

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.2")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.6")