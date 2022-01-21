@Smoke
  Feature: BookIT login
    Scenario:User logs in BookIT
      Given User is on BookIT login Page
      When user enters "emaynell8f@google.es" to email field
      And user enters "besslebond" to password field
      And User clicks on sign in button