Feature: Postcode
  As a user I want ot be able to insert my postcode and click submit to get a quote

  Scenario: Submit postcode
    Given I am on the Home page
    When I insert my postcode as "G128RF"
    And I press "Get A Quote"
    Then I should go to the next page
