package VodafoneRestAssuredURL;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given ;
import java.util.*;

public class TestGetAllPostsAPI {
  @Test
  public void vaildate_response_code() {
	  
	  given().get("https://jsonplaceholder.typicode.com/posts/1").then().assertThat().statusCode(200);
	  
	  @Test
	  public void vaildate_response_Body() {
		  
		 Response resp_body = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1") ;  
		 Assert.assertEquals(resp_body.statusCode(),200);
	  
	  
	  
  }
}
