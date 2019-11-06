Feature: Bookshelf Login Feature

Scenario Outline: Bookshelf Login Test Scenario

Given bookshelf user is on bookshelf login page
When title of login page is VitalSource Bookshelf Sign In
Then bookshelf user enters "<username>" and "<password>" 
Then user clicks on SignIn button
Then bookshelf home page should be displayed
Examples: 
   | username | password |
   | sm_sk_20191101@yopmail.com | hb!7t23hN6WJvWq |

Scenario Outline: Bookshelf Login Test by providing only user email and blank password

Given bookshelf user is on bookshelf login page
When title of login page is VitalSource Bookshelf Sign In
Then bookshelf user enters "<username>" and "<password>" 
Then user clicks on SignIn button
Then bookshelf home page should be displayed
Then verify the message please enter the password
Examples: 
   | username | password |
   | sm_sk_20191101@yopmail.com |  |

Scenario Outline: Bookshelf Login Test by providing blank email and by entering password

Given bookshelf user is on bookshelf login page
When title of login page is VitalSource Bookshelf Sign In
Then bookshelf user enters "<username>" and "<password>" 
Then user clicks on SignIn button
Then bookshelf home page should be displayed
Then verify the message please enter an email address
Examples: 
   | username | password |
   |  | hb!7t23hN6WJvWq |

Scenario Outline: Bookshelf Login Test by providing blank email and blank password

Given bookshelf user is on bookshelf login page
When title of login page is VitalSource Bookshelf Sign In
Then bookshelf user enters "<username>" and "<password>" 
Then user clicks on SignIn button
Then bookshelf home page should be displayed
Then verify both the messages
Examples: 
   | username | password |
   |  |  |
