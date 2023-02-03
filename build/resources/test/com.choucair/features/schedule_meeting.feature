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
  Scenario Outline: schedule a meeting with the minimum required
    Given the user has been sent to the Test page
    When I find the page I enter my credentials
      |strUserName    |strpassword  |
      |<strUserName> |<strpassword> |
    And we schedule the meeting
      |strMeetingName  |strMeetingType     | strStartDate   |strEndDate    |strhourStart     |strhourEnd   |
      |<strMeetingName>| <strMeetingType>  |<strStartDate>  | <strEndDate> | <strhourStart>  |<strhourEnd>|

    Examples:
      |strUserName    |strpassword  |strMeetingName  |strMeetingType      | strStartDate   |strEndDate   |strhourStart   |strhourEnd  |
      |admin          | serenity    |    planning    |  Customer          |  04/Feb/2023    | 04/Feb/2023  | 08:30         |  10:30     |

