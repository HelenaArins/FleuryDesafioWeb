#Author: lena.arins@gmail.com
@tag
Feature: [Fleury] - QA Automação - Desafio Web

  @tag1
 Scenario: Validation of the unit title
	Given that the user acess the Fleury page
	When the user click on the Unity 
	And the user clicks to select an item in the Filter by ease
	And the user selects the first option in the units
	Then the title shoud be the same as that selected
	And the page shoud be closed
