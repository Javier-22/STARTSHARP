#Automator:Javier Alberto Romero Oviedo
#Page:startSharp
#Module:Meetings
#Section:Meeting

Feature: perform the tests on the start sharp portal
  and verify the different quality attributes

  As a user,
  I want to schedule a quick meeting,
  for my work team


  @RegressionMeeting @Meeting
  Scenario Outline: schedule a new meeting
    Given the user has been sent to the Test page
    When I find the page I enter my credentials
      |strUserName    |strpassword  |
      |<strUserName> |<strpassword> |
    And we schedule the meeting
      |strMeetingName  |strMeetingType     |strMeetingNumber| strStartDate   |strEndDate    |strhourStart     |strhourEnd   |strLocation   |strUnit    |strOrganizedBy  |strReporter   |strAttendeeList    |
      |<strMeetingName>| <strMeetingType>  |<strMeetingNumber>|<strStartDate>  | <strEndDate> | <strhourStart>  |<strhourEnd> | <strLocation>| <strUnit> |<strOrganizedBy>|<strReporter> | <strAttendeeList> |
   Then then we verify that the meeting has been scheduled:planning
    Examples:
      |strUserName    |strpassword  |strMeetingName  |strMeetingType    |strMeetingNumber  | strStartDate   |strEndDate   |strhourStart   |strhourEnd  |strLocation |strUnit          |strOrganizedBy|strReporter|strAttendeeList|
      |admin          | serenity    |    planning    |  Customer        |  WDM-05          |  2/Mar/2024    | 2/Mar/2024  | 08:30         |  11:30     |  ON SITE    |  Administration | Steven López | alexis lopez  |  James Jones   |

