import com.microsoft.azure.functions._
import com.microsoft.azure.functions.annotation._

import java.util.Optional

class Function:
  @FunctionName("ScalaFunction")
  def run(@HttpTrigger(
            name = "req",
            methods = Array(HttpMethod.GET),
            authLevel = AuthorizationLevel.ANONYMOUS)
          request: HttpRequestMessage[Optional[String]],
          context: ExecutionContext): HttpResponseMessage =
    context.getLogger.info("Incoming HTTP request...")
    val name = Option(request.getQueryParameters.get("name"))

    val message = name match
      case Some(x) => s"Hello, $x"
      case None    => "Please pass a name in the query."

    request
      .createResponseBuilder(HttpStatus.OK)
      .body(message)
      .build