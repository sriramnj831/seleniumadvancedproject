Feature: Login

  Scenario Outline: Successful Login
    Given User is in Home Page
    When User enters "<username>" and "<password>" & clicks Submit button
    Then Login is successful

    
Examples:
|username|password|
|tutorial|tutorial|
|sriram|sriram|    