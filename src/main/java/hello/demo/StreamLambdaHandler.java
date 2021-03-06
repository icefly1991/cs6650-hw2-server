//package hello.demo;
//
//import com.amazonaws.serverless.exceptions.ContainerInitializationException;
//import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
//import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
//import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
//import com.amazonaws.services.lambda.runtime.Context;
//import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
//
//import org.springframework.context.annotation.Profile;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//@EnableWebMvc
//@Profile("lambda")
//public class StreamLambdaHandler implements RequestStreamHandler {
//  private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
//  static {
//    try {
//      handler.activateSpringProfiles("lambda");
//      handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(DemoApplication.class);
//    } catch (ContainerInitializationException e) {
//      // if we fail here. We re-throw the exception to force another cold start
//      e.printStackTrace();
//      throw new RuntimeException("Could not initialize Spring Boot application", e);
//    }
//  }
//
//  @Override
//  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
//      throws IOException {
//    handler.proxyStream(inputStream, outputStream, context);
//  }
//}