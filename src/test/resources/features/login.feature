#author: Lucas-QA
@login
  Feature: login application

    Background: Access screen login
      Given access screen "login"

      Scenario: Validate login application successfully
        When perform the login with the user
        | username                          | password |
        | projectairbnbautomation@gmail.com | Lj@587027 |
        And select account profile
        Then check login with user "Project airbnb automation" with success