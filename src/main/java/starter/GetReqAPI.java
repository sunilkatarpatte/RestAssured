package starter;

import java.io.IOException;
import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import api.Util.Util;

public class GetReqAPI {
	Properties prop;
	String baseURL;
	String resource;
	Response res;
	
	public void loadBaseURI() throws IOException {
	prop=Util.loadProperty();
	baseURL=prop.getProperty("baseURI");
	RestAssured.baseURI=baseURL;
	}

	public void getResource(String keyAPI) {
		resource=keyAPI;
	}
	
	public void sendGetReq() {
		
		 given().queryParam("page","2").
		 when().get(resource).
		 then().assertThat().statusCode(201);
		
	}
	
}
