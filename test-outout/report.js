$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("start.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: lena.arins@gmail.com"
    }
  ],
  "line": 3,
  "name": "[Fleury] - QA Automação - Desafio Web",
  "description": "",
  "id": "[fleury]---qa-automação---desafio-web",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validation of the unit title",
  "description": "",
  "id": "[fleury]---qa-automação---desafio-web;validation-of-the-unit-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that the user acess the Fleury page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user click on the Unity",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user clicks to select an item in the Filter by ease",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user selects the first option in the units",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the title shoud be the same as that selected",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the page shoud be closed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.that_the_user_acess_the_Fleury_page()"
});
formatter.result({
  "duration": 3609355800,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_user_click_on_the_Unity()"
});
formatter.result({
  "duration": 2904210300,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_user_clicks_to_select_an_item_in_the_Filter_by_ease()"
});
formatter.result({
  "duration": 164597200,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_user_selects_the_first_option_in_the_units()"
});
formatter.result({
  "duration": 63230500,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_title_shoud_be_the_same_as_that_selected()"
});
formatter.result({
  "duration": 1493252000,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_page_shoud_be_closet()"
});
formatter.result({
  "duration": 63629800,
  "status": "passed"
});
});