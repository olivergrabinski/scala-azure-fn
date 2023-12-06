name := "scala-azure-fn"

scalaVersion := "3.1.1"

libraryDependencies += "com.microsoft.azure.functions" % "azure-functions-java-library" % "3.1.0"
assembly / assemblyOutputPath := baseDirectory.value / "function-app" / "scala-az-fn.jar"