Feature: Application Login

  Background:
    Given Setup the entries in database
    When Lanuch the browser using config file
     And hit home page url
#  Scenario: Admin page default login
#    Given user is on netbanking page
#    When user login into the application with "admin1" and password "1234"
#    Then Home page is displayed
#
#    Scenario: User page default login
#      Given user is on netbanking page
#      When user login into the application with "admin2" and password "1111"
#      Then Home page is displayed

      Scenario Outline: Login with different users
        Given user is on netbanking page
        When user login into the application with "<username>" and password "<password>"
        Then Home page is displayed
        Examples:
        | username | password|
        | aaaa     | 123     |
        | bbb      | 345     |
        Scenario: login with different data sets in when
          Given user is on netbanking page
          When user login into the application
          | palak |
          | choubey |
          | palak09@gmail.com |
          |8050784876         |
          Then Home page is displayed
