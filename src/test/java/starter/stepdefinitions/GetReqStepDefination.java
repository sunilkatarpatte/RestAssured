package starter.stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import starter.GetReqAPI;

public class GetReqStepDefination {
	
	public GetReqAPI getReqapi=new GetReqAPI();
	
	@Given("The user have base URI")
	public void userHaveBaseURI() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		getReqapi.loadBaseURI();
	   	}
	
	@Given("The user have {string} resource")
	public void the_user_have_resource(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 getReqapi.getResource(string);
	}
	
	@When("The user sents GET request to regres API with API key")
	public void the_user_sents_GET_request_to_regres_API_with_API_key() {
	    // Write code here that turns the phrase above into concrete actions
	 getReqapi.sendGetReq();
	}

}
