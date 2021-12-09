# Scala Azure Function
While Scala is not an officially supported language for writing Azure Functions, we can leverage its interoperability with Java to easily write and deploy Azure Functions written in Scala. This relies mainly on the use of the Java library `azure-functions-java-library`.

This repository is a simple example of a working Azure Function written in Scala. You can use it as a template to write your own functions.

## How to run the Azure Function
1. Install the [azure-functions-core-tools](https://github.com/Azure/azure-functions-core-tools).
2. Build the app with `sbt assembly`
3. Run your app locally `func host start --java`
4. Deploy your app to Azure `func azure functionapp publish {function_app_name_in_Azure} --java`

## Notes
* As of writing, this function has been deployed to a Function App with runtime 4.0, and JRE 11 as worker runtime.
* The project is written in Scala 3, but this process can be very easily adapted to any previous Scala version.

## Documentation
* [Azure Functions Java developer guide](https://docs.microsoft.com/en-us/azure/azure-functions/functions-reference-java)
* [Library for Azure Java Functions](https://docs.microsoft.com/en-us/java/api/overview/azure/readme)

## Credit
This repo is based on a [blog post](https://web.archive.org/web/20210103161031/https://monteledwards.com/2018/10/07/deploying-scala-code-on-azure-functions/) by Montel Edwards. As of writing, the post is down and only accessible via the internet archive. In addition, related repo is no longer available.