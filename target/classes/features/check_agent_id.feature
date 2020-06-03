Feature: Verify Agent Id in Rep Registration Page

@weekly
Scenario: Search by keywords on google
Given a user is on landing page



@manual
Scenario Outline: Agent Id in Rep Registration must match with agent id provided in landing page
Given a user is on landing page
When a user search for <keyword>
Then a user lands on result page and verify <results>

Examples:
|keyword | results |
|NENY0000 | About|