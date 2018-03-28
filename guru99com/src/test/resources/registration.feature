Feature:Registration
  Scenario Outline: User can enter Registration detail so User can login successfully

    Given User is on homepage
    When User click on Register button and Registration page will open
    When User enter First neme "<First Name>"
    And  User enter Last Name "<Last name>"
    And  User enter Phone Number "<Phone Number>"
    And  User enter Email "<Email>"
    And  User enter Address 1st Line "<Address 1st Line>"
    And  User enter City "<City>"
    And  User enter State/Province "<State or Province>"
    And  User enter Postal code "<Postal code>"
    And  User enter Country "<Country>"
    And  User enter User Name "<User Name>"
    And  User enter Password "<Password>"
    And  User enter Confirm Password "<Confirm Password>"
    And  User click on SUBMIT button
    Then User redirect to Register Page
    And User can See Message "<Message>"


    Examples:
    |First Name|Last name|Phone Number|Email              |Address 1st Line|City     |State or Province|Postal code|Country|User Name          |Password|Confirm Password|Message|
    |Ankit     |Chikani  |07825376697 |agchikani@gmail.com|Lanchbury Lane  |Ahmedabad|Gujarat          |380013     |INDIA  |agchikani@gmail.com|abcd1234|abcd1234        | Note: Your user name is agchikani@gmail.com.|