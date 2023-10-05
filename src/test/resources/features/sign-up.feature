#author: Lucas
  @signup

Feature: Register

  Background:
    Given access screen "login"

  @sign_up_correct
  Scenario: Successfully validate registration in the application
    When enter the information of a new user
    Then should perform the registration with success