Feature: testing mystore site
Background: Launching app url
  Given I launch the application url

@test1
Scenario: testing my store home page
  Then I verify user is land on application url

@test2
Scenario: testing search bar
  When I search for "mens" in search bar


@test3
Scenario: testing abc
  When abc
