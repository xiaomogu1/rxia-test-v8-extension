package org.acme;

import io.quarkus.test.QuarkusUnitTest;
import io.restassured.RestAssured;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.hamcrest.Matchers.containsString;

public class GreetingTest {
	
  @RegisterExtension
  static final QuarkusUnitTest config = new QuarkusUnitTest()
    .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)); 

  @Test
  public void testGreeting() {
    RestAssured.when().get("/greeting").then().statusCode(200).body(containsString("Hello")); 
  }
  
  
  @Test
  public void testGreeting2() {
	  //http://localhost:8080/quarkus/arc
    //RestAssured.when().get("/quarkus/arc").then().log().all().statusCode(200).body(containsString("Hello")); 
  }
}