Scenario Outline: Login with different users with hooks
Given user is on netbanking page
When user login into the application with "<username>" and password "<password>"
Then Home page is displayed
Examples:
| username | password|
| aaaa     | 123     |
| bbb      | 345     |
Scenario: login with different data sets in when
Given user is on netbanking page
When user login into the application
| palak |
| choubey |
| palak09@gmail.com |
|8050784876         |
Then Home page is displayed
