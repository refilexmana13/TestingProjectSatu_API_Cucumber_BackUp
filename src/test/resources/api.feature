Feature: Test Automation API

  @api
  Scenario: Test get list data
    Given prepare url valid for get list data
    And hit api get list data
    Then verify status code
    Then verify response message
    Then verify data list should be not null