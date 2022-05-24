Feature: Application Login

  Scenario: user Login
    Given user on landing Page
    When enter username "xyz@gmail.com" and password "xyz"
    And click on submit
    Then if login successfull
    And go to gome page "true"

  Scenario: user Login
    Given user on landing Page
    When enter username "abc@gmail.com" and password "abcd"
    And click on submit
    Then if login successfull
    And go to gome page "false"
