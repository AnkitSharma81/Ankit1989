@tag
Feature: Youtube Automate
  I want to use this template for my feature file

  @tag1
  Scenario: Login to youtube
    Given Launch chrome browser
    Then Open youtube application URL
    Then Click on Signin link on youtube homepage
    Then Enter username
    Then Enter password
    Then Click on login button
    Then User account should login successfully
    And Logout from youtube account

  #@tag2
  #Scenario:Title 
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step


  