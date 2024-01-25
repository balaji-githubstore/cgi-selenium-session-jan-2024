@login
Feature: Login
  In order to maintatin the health records
  As a user
  I want to access the OpenEMR dashboard

  Background: 
    Given I have browser with OpenEMR application

  @valid @smoke
  Scenario Outline: Valid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should get access to the portal with title '<expected_title>'

    Examples: 
      | username   | password   | expected_title |
      | admin      | pass       | OpenEMR        |
      | accountant | accountant | OpenEMR        |

  @invalid
  Scenario: Invalid Login
    When I enter username as 'john'
    And I enter password as 'john123'
    And I click on login
    Then I should not get access to portal with error as 'Invalid username or password'
