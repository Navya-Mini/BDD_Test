$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "User Login",
  "description": "  User should be able to login using valid credentials",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing Login with Valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "I am on Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \u003cusername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on new customer for verification",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ]
    },
    {
      "cells": [
        "mngr397779",
        "K8KHvTADODw\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing Login with Valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "I am on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.Navigatetologin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter mngr397779 and K8KHvTADODw\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.EnterLogins(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new customer for verification",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.sucessful()"
});
formatter.result({
  "status": "passed"
});
});