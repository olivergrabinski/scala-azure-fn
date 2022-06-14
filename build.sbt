name := "scala-azure-fn"

scalaVersion := "3.1.1"

libraryDependencies += "com.microsoft.azure.functions" % "azure-functions-java-library" % "2.0.1"
assembly / assemblyOutputPath := baseDirectory.value / "function-app" / "scala-az-fn.jar"