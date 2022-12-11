Feature: Retail Account Page


Background: 
Given User is on retail website
When User click on Sign in option
And User enter email 'qais@gmail.com' and password 'Tek@12345'
And User click on login button
And User should be logged in into Account
When User click on Account option


@account
Scenario: Verify User can update Profile Information
And User update Name 'Ahmad Wais' and Phone '(925)8770359'
And User click on Update button
Then user profile information should be updated

@password
Scenario: Verify User can Update password
And User enter below information
|previousPassword  |newPassword  |confirmPassword |
|Tek@12345         |Kabul@12345  | Kabul@12345    |     
And User click on Change Password button 
Then a message should be displayed ‘Password Updated Successfully’

@paycard
Scenario: Verify User can add a payment method
And User click on Add a payment method link
And User fill Debit or credit card information
|cardNumber       |nameOnCard  |expirationMonth|expirationYear|securityCode|
|2598742365418963 | Janibrahim |12              |2025         |133         |
And User click on Add your card button 
Then a message should be displayed ‘Payment Method added successfully’

@updatecard
Scenario: Verify User can edit Debit or Credit card  
And User click on Edit option of card section
And user edit information with below data 
|cardNumber       |nameOnCard|expirationMonth|expirationYear|securityCode|
|2598742365874569 | Nasiri   |6             |2027          |455         |
And user click on Update Your Card button 
Then a message should be displayed ‘Payment Method updated Successfully'

@removecard
Scenario: Verify User can remove Debit or Credit card
#And User select card with ending 2148
And User click on remove option of card section
Then payment details should be removed

@addaddress
Scenario: Verify User can add an Address  
And User click on Add address option 
And user fill new address form with below information 
|Country    |Full Name			|Phone Number  |Address      |apt |City      | state |Zip code|
|Afghanistan| Farooq  |+93799418897  | 6th Street  | 62 | Macroyan | Kabul |20203   |
And User click Add Your Address button 
Then a message should be displayed ‘Address Added Successfully’

@editaddress
Scenario: Verify User can edit an Address added on account 
And User click on edit address option 
And user edit new address form with below information 
|Country|Full Name      |Phone Number |Address      |apt |City         | state     |Zip code|
|USA    | Ahmad Nasiri | 9258336548 | 12th Street | 25 | WalnutCreek | Califronia| 95720 |
And User click update Your Address button 
Then a message should be displayed ‘Address Updated Successfully’

@removeaddress
Scenario: Verify User can remove Address from Account 
And User click on remove option of Address section
Then Address details should be removed
