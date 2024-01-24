@Login
Feature: Verifying eMsales Login Automation

  Scenario Outline: Verifying login with valid credentials.
    Given user is on the eMsales page
    When user login "<username>","<password>"
    Then user should verify sucess message after login "Welcome"

    Examples: 
      | username                       | password    |
      | karthik.anandan@empulseone.com | Karthik@123 |

  Scenario Outline: Verifying login with valid credentials using ENTER Key
    Given user is on the eMsales page
    When user login "<username>","<password>" with Enter Key
    Then user should verify sucess message after login "Welcome"

    Examples: 
      | username                       | password    |
      | karthik.anandan@empulseone.com | Karthik@123 |

  Scenario Outline: Verifying login with invalid credentials
    Given user is on the eMsales page
    When user login "<username>","<password>"
    Then user should verify the error message after login "Password is required."

    Examples: 
      | username                       | password |
      | karthik.anandan@empulseone.com |          |
