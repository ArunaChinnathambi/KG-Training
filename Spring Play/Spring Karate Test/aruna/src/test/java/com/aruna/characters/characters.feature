Feature: sample karate test script 

Background:
* url baseUrl

Given path '//localhost:/8080/api/characters'
And request users
When method post
Then status 200