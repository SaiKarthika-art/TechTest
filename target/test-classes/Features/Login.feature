Feature: Login feature

Background: User navigates to the URL
Given user navigates to the URL


Scenario: Validate the error message when both email and password fields left blank
When user does not enter email and password
Then email and password required error message should be displayed

Scenario Outline: Validate the error message when user enters incorrect credentials
When user enters incorrect "<email>" or "<password>"
Then Incorrect email or password error message should be displayed

Examples:

| email | |password |

| Keer@gmail.com | | Karthi |

Scenario Outline: Validate the error message when user enters incorrect credentials three times in a row with same email
When user enters incorrect "<email>" or "<password>" three times in a row with same email
Then Account lockout popup should be displayed

Examples:

| email | |password |

| Sath@gmail.com | | Karthi |

Scenario Outline: Validate the error message when user enters incorrect credentials five times in a row with same email
When user enters incorrect "<email>" or "<password>" five times in a row with same email
Then Account has locked message should be displayed

Examples:

| email | |password |

| Sakthi@gmail.com | | Karthi |




