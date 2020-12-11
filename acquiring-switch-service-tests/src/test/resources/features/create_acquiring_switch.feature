@create_acquiring_switch
Feature: When I create a AcquiringSwitch, then I create a AcquiringSwitch

  Scenario: When I call the endpoint a new AcquiringSwitch is created
    Given I use the following body parameter of type SAAcquiringSwitch:
      | description           |
      | description-session() |
    When I call AcquiringSwitch.doAcquiringSwitch endpoint
    Then the acquiring_switch table has rows where description is equal to description-session() and contains the following data:
      | version |
      | 0       |
