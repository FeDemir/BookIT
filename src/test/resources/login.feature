@Login, @Smoke
Feature: : As a user, I should be able to login in Bookit login page.

  Scenario: Verify that the user can log in with valid credentials.
    Given the user on the "QA3.url" login page
    When user logs in using "emaynell8f@google.es" and "besslebond"
    Then the user should be able login
    And  dashboard page header should be visible

  Scenario: Verify that the user can't log in with invalid credentials.
    Given the user on the "QA3.url" login page
    When user logs in using "wrong_email" and "besslebond"
    Then the user shouldn't be able login
    And  user should be able to see “ [objectProgressEvent] ” message

  Scenario: Verify that the user can't log in with invalid credentials.
    Given the user on the "QA3.url" login page
    When user logs in using "emaynell8f@google.es" and "wrong_password"
    Then the user shouldn't be able login
    And  user should be able to see “ [objectProgressEvent] ” message

  Scenario: Verify that the user can't log in with empty credentials.
    Given the user on the "QA3.url" login page
    When user logs in using "" and ""
    Then sing in button should be disabled