Feature: Login

  Scenario Outline: Check login is successfull with vaild creadencials
    Given User is on login page
    When User enters vaild username "<username>"
    And User enters vaild password "<password>"
    And clicks on the Login button
    Then user enters the home page
    And close the browser

    Examples: 
      | username       | password    |
      | admin@tria.plc | eschool@123 |

  @collector
  Scenario Outline: Create a Department in the application
    Given User is on login page
    When User enters vaild username "<username>"
    And User enters vaild password "<password>"
    And clicks on the Login button
    Then user enters the home page
    And goes to the Adminstration section
    Then goes to the manage section
    And select the department section
    Then create a department
    And close the browser

    @Test
    Examples: 
      | username       | password    |
      | admin@tria.plc | eschool@123 |

  @User
  Scenario Outline: Create a user in a user role
    Given User is on login page
    When User enters vaild username "<username>"
    And User enters vaild password "<password>"
    And clicks on the Login button
    Then user enters the home page
    And goes to the Adminstration section
    Then goes to the manage section
    And select the user section
    Then create a user in a user role
    And close the browser

    Examples: 
      | username       | password   |
      | admin@tria.plc | echool@123 |
      
 
     
