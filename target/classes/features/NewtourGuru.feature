Feature: Register functionality
@RegisterTour
Scenario: user enter all fields to Register
Given user navigate to Register AccountPage
When user entres the details below fields 
|firstname|mahaboob|
|lastname|shareef|
|phoneNumber|1283838383|
|email|mahaboob787@gmail.com|
|Address|10-113_RangaReddyColony_MPL|
|city|Madanapalle|
|state|andraPradesh|
|postalcode|517325|
|country|INDIA|
|UserName|mahaboobshareef123|
|password|12345@As|
|confirmpassword|12345@As|
And user can click on Submitt
Then user can Registered successfully


