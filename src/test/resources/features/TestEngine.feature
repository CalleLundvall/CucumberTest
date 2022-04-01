Feature: TestEngine

  Scenario: Test Email

    Given I have written my email ""
    Given I have written my username "wafwafwftest"
    Given I have written my password "Qwerty123!"
    When I click the Submit button
    Then my account is created

  Scenario: Test usedUsername
    Given I have written my mail "mehmettoz@gmail.com"
    Given I have written my userName "dada"
    Given I have written my passWord "Qwerty123!"
    When I click sign Up
    Then An Error is Displayed

  Scenario: Test2longusername
    Given I have the email "trololtest@gmail.com"
    Given I have the Username "dadascafegtregnredgrenjgrjzdgnrkjdsgdkgrdjdjnkfnrjdfrjkdgrjnkgrdnjkggnjkdrgkjndrngjkrdjkngdnrkgnjrkd1"
    Given I have the Password "Qwerty123!"
    When I Click the button
    Then A username too long error is displayed

  Scenario: TestCreateUser
    Given I have an available email "testafwafawgwtawamgfdhwaaw!@gmail.com"
    Given I have an available username "testadwafwfadfadamaawtest"
    Given I have my usual test password "Qwerty123!"
    When I sign up
    Then User is successfully created
