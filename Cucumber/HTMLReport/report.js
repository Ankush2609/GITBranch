$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Precondition.feature");
formatter.feature({
  "line": 1,
  "name": "Precondition",
  "description": "",
  "id": "precondition",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "Testbackground",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 4,
  "name": "Test1",
  "description": "",
  "id": "precondition;test1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Test1",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "Testbackground",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "Test2",
  "description": "",
  "id": "precondition;test2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Test2",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "Testbackground",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "Test3",
  "description": "",
  "id": "precondition;test3",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Test3",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login with valid Credential",
  "description": "",
  "id": "login;login-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Username as \"Admin\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Username as \"User\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enters Username \u0026 password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on \"\u003cButton\u003e\" button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Not click reset button",
  "keyword": "But "
});
formatter.step({
  "line": 8,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "add items to cart",
  "rows": [
    {
      "cells": [
        "Catagery",
        "Brand"
      ],
      "line": 10
    },
    {
      "cells": [
        "mobile",
        "Nokia"
      ],
      "line": 11
    },
    {
      "cells": [
        "mobile",
        "Mi"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login;login-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "Button"
      ],
      "line": 15,
      "id": "login;login-with-valid-credential;;1"
    },
    {
      "cells": [
        "Login"
      ],
      "line": 16,
      "id": "login;login-with-valid-credential;;2"
    },
    {
      "cells": [
        "Submit"
      ],
      "line": 17,
      "id": "login;login-with-valid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Login with valid Credential",
  "description": "",
  "id": "login;login-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Username as \"Admin\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Username as \"User\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enters Username \u0026 password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on \"Login\" button",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Not click reset button",
  "keyword": "But "
});
formatter.step({
  "line": 8,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "add items to cart",
  "rows": [
    {
      "cells": [
        "Catagery",
        "Brand"
      ],
      "line": 10
    },
    {
      "cells": [
        "mobile",
        "Nokia"
      ],
      "line": 11
    },
    {
      "cells": [
        "mobile",
        "Mi"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 35
    }
  ],
  "location": "Test.Credentails(String,String)"
});
formatter.result({
  "duration": 255875350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 34
    }
  ],
  "location": "Test.Credentails(String,String)"
});
formatter.result({
  "duration": 263174,
  "status": "passed"
});
formatter.match({
  "location": "Test.EnterCredentails()"
});
formatter.result({
  "duration": 190301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "Test.ClickLogin(String)"
});
formatter.result({
  "duration": 232968,
  "status": "passed"
});
formatter.match({
  "location": "Test.ClickNotReset()"
});
formatter.result({
  "duration": 160472,
  "status": "passed"
});
formatter.match({
  "location": "Test.LoginSuccessful()"
});
formatter.result({
  "duration": 66832,
  "status": "passed"
});
formatter.match({
  "location": "Test.add_to_cart(DataTable)"
});
formatter.result({
  "duration": 1958513,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login with valid Credential",
  "description": "",
  "id": "login;login-with-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Username as \"Admin\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Username as \"User\" \u0026 Password as \"Password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enters Username \u0026 password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on \"Submit\" button",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Not click reset button",
  "keyword": "But "
});
formatter.step({
  "line": 8,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "add items to cart",
  "rows": [
    {
      "cells": [
        "Catagery",
        "Brand"
      ],
      "line": 10
    },
    {
      "cells": [
        "mobile",
        "Nokia"
      ],
      "line": 11
    },
    {
      "cells": [
        "mobile",
        "Mi"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 35
    }
  ],
  "location": "Test.Credentails(String,String)"
});
formatter.result({
  "duration": 233345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 34
    }
  ],
  "location": "Test.Credentails(String,String)"
});
formatter.result({
  "duration": 198230,
  "status": "passed"
});
formatter.match({
  "location": "Test.EnterCredentails()"
});
formatter.result({
  "duration": 137817,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 10
    }
  ],
  "location": "Test.ClickLogin(String)"
});
formatter.result({
  "duration": 217110,
  "status": "passed"
});
formatter.match({
  "location": "Test.ClickNotReset()"
});
formatter.result({
  "duration": 46064,
  "status": "passed"
});
formatter.match({
  "location": "Test.LoginSuccessful()"
});
formatter.result({
  "duration": 166891,
  "status": "passed"
});
formatter.match({
  "location": "Test.add_to_cart(DataTable)"
});
formatter.result({
  "duration": 357947,
  "status": "passed"
});
});