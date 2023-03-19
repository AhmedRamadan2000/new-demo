Feature: Login functionality
  As a user
  I want to login to my account
  So that I can access the system

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And click on the login button
    Then I should be redirected to the home page

#  Scenario: Invalid username
#    Given I am on the login page
#    When I enter invalid username
#    And valid password
#    And click on the login button
#    Then I should see an error message
#
#  Scenario: Invalid password
#    Given I am on the login page
#    When I enter valid username
#    And invalid password
#    And click on the login button
#    Then I should see an error message
#
#  Scenario: Empty username and password
#    Given I am on the login page
#    When I enter empty username and password
#    And click on the login button
#    Then I should see an error message
#
#  Scenario: Forgot password
#    Given I am on the login page
#    When I click on the "forgot password" link
#    Then I should be redirected to the forgot password page