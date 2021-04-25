$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo1.feature");
formatter.feature({
  "line": 2,
  "name": "Google Page test",
  "description": "",
  "id": "google-page-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check the google page",
  "description": "",
  "id": "google-page-test;check-the-google-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to open google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_want_to_open_google_home_page()"
});
formatter.result({
  "duration": 7011515800,
  "status": "passed"
});
});