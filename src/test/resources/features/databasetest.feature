@db
  Feature: Test database connection
    Scenario: print headers for books
      Given user on no page
      Then user prints column headers for books