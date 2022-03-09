name := "scala-azure-fn"

scalaVersion := "3.1.1"

libraryDependencies += "com.microsoft.azure.functions" % "azure-functions-java-library" % "1.4.2"
assembly / assemblyOutputPath := baseDirectory.value / "function-app" / "scala-az-fn.jar"