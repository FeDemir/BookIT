@Smoke
  Feature: BookIT login
    Scenario:User logs in BookIT
      Given User is on BookIT login Page
      When user enters "bmurkus8q@psu.edu" to email field
      And user enters "alicasanbroke" to password field
      And User clicks on sign in button
      Then user mainmap is visible