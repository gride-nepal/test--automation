Feature: Verify Agent Id in Rep Registration Page

@weekly
Scenario Outline: Agent Id in Rep Registration must match with agent id provided in landing page
Given a user is on landing page
And a user search for <keyword>
Then a user lands on result page and verify <results>

Examples:
|keyword | results |
|Nepal | About|

@manual
Scenario Outline: Agent Id in Rep Registration must match with agent id provided in landing page
Given a user is on landing page
And a user search for <keyword>
Then a user lands on result page and verify <results>

Examples:
|keyword | results |
|NENY0000 | About|