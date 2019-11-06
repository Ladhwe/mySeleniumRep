$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/workspace/Bookshelf/src/main/java/features/bookshelflogin.feature");
formatter.feature({
  "line": 1,
  "name": "Bookshelf Login Feature",
  "description": "",
  "id": "bookshelf-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Bookshelf Login Test Scenario",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "bookshelf user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "bookshelf-login-feature;bookshelf-login-test-scenario;;1"
    },
    {
      "cells": [
        "sm_sk_20191101@yopmail.com",
        "hb!7t23hN6WJvWq"
      ],
      "line": 12,
      "id": "bookshelf-login-feature;bookshelf-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Bookshelf Login Test Scenario",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "bookshelf user enters \"sm_sk_20191101@yopmail.com\" and \"hb!7t23hN6WJvWq\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.title_of_login_page_is_VitalSource_Bookshelf_Sign_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sm_sk_20191101@yopmail.com",
      "offset": 23
    },
    {
      "val": "hb!7t23hN6WJvWq",
      "offset": 56
    }
  ],
  "location": "Login.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Bookshelf Login Test by providing only user email and blank password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-only-user-email-and-blank-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "bookshelf user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "verify the message please enter the password",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-only-user-email-and-blank-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-only-user-email-and-blank-password;;1"
    },
    {
      "cells": [
        "sm_sk_20191101@yopmail.com",
        ""
      ],
      "line": 24,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-only-user-email-and-blank-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Bookshelf Login Test by providing only user email and blank password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-only-user-email-and-blank-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "bookshelf user enters \"sm_sk_20191101@yopmail.com\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "verify the message please enter the password",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.title_of_login_page_is_VitalSource_Bookshelf_Sign_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sm_sk_20191101@yopmail.com",
      "offset": 23
    },
    {
      "val": "",
      "offset": 56
    }
  ],
  "location": "Login.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Bookshelf Login Test by providing blank email and by entering password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-by-entering-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "bookshelf user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "verify the message please enter an email address",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-by-entering-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 35,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-by-entering-password;;1"
    },
    {
      "cells": [
        "",
        "hb!7t23hN6WJvWq"
      ],
      "line": 36,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-by-entering-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 36,
  "name": "Bookshelf Login Test by providing blank email and by entering password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-by-entering-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "bookshelf user enters \"\" and \"hb!7t23hN6WJvWq\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "verify the message please enter an email address",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.title_of_login_page_is_VitalSource_Bookshelf_Sign_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 23
    },
    {
      "val": "hb!7t23hN6WJvWq",
      "offset": 30
    }
  ],
  "location": "Login.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "Bookshelf Login Test by providing blank email and blank password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-blank-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "bookshelf user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "verify both the messages",
  "keyword": "Then "
});
formatter.examples({
  "line": 46,
  "name": "",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-blank-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 47,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-blank-password;;1"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 48,
      "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-blank-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 48,
  "name": "Bookshelf Login Test by providing blank email and blank password",
  "description": "",
  "id": "bookshelf-login-feature;bookshelf-login-test-by-providing-blank-email-and-blank-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "bookshelf user is on bookshelf login page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "title of login page is VitalSource Bookshelf Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "bookshelf user enters \"\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "user clicks on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "bookshelf home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "verify both the messages",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.title_of_login_page_is_VitalSource_Bookshelf_Sign_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 23
    },
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "Login.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_clicks_on_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});