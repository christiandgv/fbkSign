name := """ebills"""
organization := "ec.com.kruger"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += filters
libraryDependencies += javaWs


//swagger
libraryDependencies += "org.webjars" % "swagger-ui" % "2.2.10-1"
libraryDependencies += "javax.validation" % "validation-api" % "1.1.0.Final"



libraryDependencies += "com.couchbase.client" % "java-client" % "2.5.3"
libraryDependencies += "net.sf.flexjson" % "flexjson" % "3.3"
//libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes

libraryDependencies += "io.dropwizard.metrics" % "metrics-core" % "3.2.1"
//libraryDependencies += "com.palominolabs.http" % "url-builder" % "1.1.0"
libraryDependencies += "net.jodah" % "failsafe" % "1.0.3"

libraryDependencies += "io.swagger" % "swagger-annotations" % "1.5.15"
libraryDependencies += "com.squareup.okhttp" % "okhttp" % "2.7.5"
libraryDependencies += "com.squareup.okhttp" % "logging-interceptor" % "2.7.5"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"
libraryDependencies += "joda-time" % "joda-time" % "2.9.9"

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes

publishArtifact in (Compile, packageDoc) := false
sources in (Compile,doc) := Seq.empty
