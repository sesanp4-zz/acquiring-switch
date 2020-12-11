@send_message
Feature: When I send an event, another event is sent back

  Scenario: When I send an event, I get a message back
    When I send the following message of type AcquiringSwitchEvent:
      | fieldName | fieldValue | fieldType |
    Then the messages of type AcquiringSwitchEvent have been received

