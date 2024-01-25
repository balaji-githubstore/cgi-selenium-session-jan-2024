@patient
Feature: Paitent
  In order to maintatin the patients records
  As a user
  I want to add,edit,delete records

  Scenario: Add valid Patient
    Given I have browser with OpenEMR application
    When I enter username as 'admin'
    And I enter password as 'pass'
    And I click on login
    And I click on patient menu
    And I click on new-search menu
    And I fill the add patient form
      | firstname | lastname | dob        | gender |
      | john      | wick     | 2024-01-25 | Male   |
		And I click on create new patient
		And I click on confirm create new patient
		And I handle the alert box
		And I close the birthday popup
		Then I should get the added patient profile 'Medical Record Dashboard - john wick'