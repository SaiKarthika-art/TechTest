$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User navigates to the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the error message when both email and password fields left blank",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user does not enter email and password",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_does_not_enter_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "email and password required error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.email_and_password_required_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate the error message when user enters incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"\u003cemail\u003e\" or \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Incorrect email or password error message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "Keer@gmail.com",
        "",
        "Karthi"
      ]
    }
  ]
});
formatter.background({
  "name": "User navigates to the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the error message when user enters incorrect credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"Keer@gmail.com\" or \"Karthi\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_incorrect_or(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Incorrect email or password error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.incorrect_email_or_password_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate the error message when user enters incorrect credentials three times in a row with same email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"\u003cemail\u003e\" or \"\u003cpassword\u003e\" three times in a row with same email",
  "keyword": "When "
});
formatter.step({
  "name": "Account lockout popup should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "Sath@gmail.com",
        "",
        "Karthi"
      ]
    }
  ]
});
formatter.background({
  "name": "User navigates to the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the error message when user enters incorrect credentials three times in a row with same email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"Sath@gmail.com\" or \"Karthi\" three times in a row with same email",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_incorrect_or_three_times_in_a_row_with_same_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account lockout popup should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.account_lockout_popup_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate the error message when user enters incorrect credentials five times in a row with same email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"\u003cemail\u003e\" or \"\u003cpassword\u003e\" five times in a row with same email",
  "keyword": "When "
});
formatter.step({
  "name": "Account has locked message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "Sakthi@gmail.com",
        "",
        "Karthi"
      ]
    }
  ]
});
formatter.background({
  "name": "User navigates to the URL",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the error message when user enters incorrect credentials five times in a row with same email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters incorrect \"Sakthi@gmail.com\" or \"Karthi\" five times in a row with same email",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_incorrect_or_five_times_in_a_row_with_same_email(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account has locked message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.account_has_locked_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});