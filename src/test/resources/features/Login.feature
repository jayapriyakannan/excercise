Feature: Login feature

  Background: Pre-condition

    Given the Home page

  Scenario: Login User with incorrect email and password
    When user clicks on the Login button
    Then user should see 'Login to your account' is visible
    When user enters incorrect credentials
    And user click login button
    Then user should see the error "Your email or password is incorrect!"

