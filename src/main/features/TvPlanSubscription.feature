Feature: User could navigate to the website and review plans

  @test
  Scenario: User should choose Saudi Arabia and discover all plans
    Given User navigate to the website
    When User Select Saudi Arabia as a country
    Then User finds plan types
    And The plan price and currency will change to SAR

  @test
  Scenario: User should choose Kuwait and discover all plans
    Given User navigate to the website
    When User Select Kuwait as a country
    Then User finds plan types
    And The plan price and currency will change to KWD