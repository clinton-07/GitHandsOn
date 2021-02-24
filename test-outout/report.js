$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("phpTravels.feature");
formatter.feature({
  "line": 1,
  "name": "sign up",
  "description": "",
  "id": "sign-up",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Sign up to the phpTravels",
  "description": "",
  "id": "sign-up;sign-up-to-the-phptravels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on the application page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Application page title is \"PHPTRAVELS | Travel Technology Partner\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "navigate to SignUp page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "fill the sign up form",
  "rows": [
    {
      "cells": [
        "Clinton",
        "Dsouza",
        "987654321",
        "clni@gmail.com",
        "nik@123",
        "nik@123"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate correct inputs are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "submit the signup form",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Quit the driver",
  "keyword": "Then "
});
formatter.match({
  "location": "sign_up.user_is_on_the_application_page()"
});
formatter.result({
  "duration": 14755252500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PHPTRAVELS | Travel Technology Partner",
      "offset": 27
    }
  ],
  "location": "sign_up.application_page_title_is(String)"
});
formatter.result({
  "duration": 113747400,
  "status": "passed"
});
formatter.match({
  "location": "sign_up.navigate_to_SignUp_page()"
});
formatter.result({
  "duration": 3623162301,
  "status": "passed"
});
formatter.match({
  "location": "sign_up.fill_the_sign_up_form(DataTable)"
});
formatter.result({
  "duration": 4410408400,
  "status": "passed"
});
formatter.match({
  "location": "sign_up.validate_correct_inputs_are_displayed()"
});
formatter.result({
  "duration": 102563200,
  "status": "passed"
});
formatter.match({
  "location": "sign_up.submit_the_signup_form()"
});
formatter.result({
  "duration": 48546900,
  "status": "passed"
});
formatter.match({
  "location": "sign_up.quit_the_driver()"
});
formatter.result({
  "duration": 2105433899,
  "status": "passed"
});
});