
@rest
Feature: Verify regres api of Google
	I want to use this template for my First feature file

  Scenario: Verify regres api
	Given The user have base URI
	And The user have '/api/users' resource
	When The user sents GET request to regres API with API key
#	Then API should return status as 200
	#And Response content type should be json
	#And Result s;hould have status as "OK"