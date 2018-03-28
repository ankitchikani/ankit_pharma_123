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




Feature: Login

  Scenario Outline: After Successful Registration User is Login to Webpage

    When User is click on SIGN-ON link
    And User enter valid "<User name>"
    And enter valid "<Password>"
    Then User can successfully Sign In
    Examples:
      | User name        | Password |
      | agchikani@gmail.com | abcd1234  |

  Scenario Outline: Select the Journey Type


    When User click on Flights
    And  User select journeytype "<JourneyType>"
    And  User Select passenger "<Passenger>"
    And User select departingfrom "<DepartingFrom>"
    And  User Select Arriving to "<Arrivingfrom>"
    And User Select Service class "<ServiceClass>"
    And click on continue
    Then User can see expected Airline "<ExpectedAirline>"

    Examples:
      | JourneyType | Passenger | DepartingFrom | Arrivingfrom | ServiceClass  | ExpectedAirline         |
      | Round Trip  | 1         | London        | New Yourk    | Economy class | Blue Skies Airlines 360 |
    |Return       |2          |Paris          |London        |Business       |United Airlines          |