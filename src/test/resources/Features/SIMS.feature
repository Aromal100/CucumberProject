Feature: Asset Management

  @Location
  Scenario Outline: Create a location in the Asset Management
    Given User is on SIMS page
    When User enters username as "<username>"
    And clicks on the next button
    And User enters password as "<password>"
    And clicks the Login button
    Then goes to the Location section
    Then clicks on the add location
    And gives the location name
    And gives the location description
    Then clicks on the add location button
    And closes the browser

    Examples: 
      | username                | password |
      | aromal.resbee@gmail.com | WJchIoJW |
