Feature: Cheak the Ekhool Login functionality

  @EkhoolLogin
  Scenario: Valid Login
    Given User enters into the browser
    And User clicks on the Login button
    Then User give valid username as "reshma@resbee.org"
    And User clicks the next button
    Then User give the password as "ekhool"
    And User clicks the continue button
    And User enters the home page
    Then User closes the browser

  @Learner
  Scenario: Creating a new learner
    Given User enters into the browser
    And User clicks on the Login button
    Then User give valid username as "reshma@resbee.org"
    And User clicks the next button
    Then User give the password as "ekhool"
    And User clicks the continue button
    And User enters the home page
    Then User then goes to users section
    And go to then goes to learners section
    And create a new learner
    Then User closes the browser

  @Group
  Scenario: Creating a new Group
    Given User enters into the browser
    And User clicks on the Login button
    Then User give valid username as "reshma@resbee.org"
    And User clicks the next button
    Then User give the password as "ekhool"
    And User clicks the continue button
    And User enters the home page
    Then User then goes to Manage section
    And go to then goes to group section
    And create a new group
    Then User closes the browser

  @Userrole
  Scenario: Creating a new User role
    Given User enters into the browser
    And User clicks on the Login button
    Then User give valid username as "reshma@resbee.org"
    And User clicks the next button
    Then User give the password as "ekhool"
    And User clicks the continue button
    And go to then goes to user role section
    And create a new user role
    Then User closes the browser
