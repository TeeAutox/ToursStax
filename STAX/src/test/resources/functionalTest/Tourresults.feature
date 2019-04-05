Feature: tour results

Scenario Outline: To test that user can launch stax US division successfully 
Given user launches <supplier> url in US
Then user should see tours result displayed 

Examples: 
|supplier           |
|Contiki            |
|Dragoman           |
|G adventures       |
|Radical            |
|Trek America       |
|1 source           |
|Grand America		|

Scenario Outline: To test that user can launch stax UK division successfully 
Given user launches <supplier> url in UK
Then user should see tours result displayed 

Examples: 
|supplier           |
|Contiki            |
|Dragoman           |
|G adventures       |
|Radical            |
|Trek America       |
|1 source           |
|Grand America		|


Scenario Outline: To test that user can launch stax AU division successfully 
Given user launches <supplier> url in AU
Then user should see tours result displayed 

Examples: 
|supplier           |
|Contiki            |
|Dragoman           |
|G adventures       |
|Radical            |
|Trek America       |
|1 source           |
|Grand America		|



Scenario Outline: To test that user can launch stax NZ division successfully 
Given user launches <supplier> url in NZ
Then user should see tours result displayed 

Examples: 
|supplier           |
|Contiki            |
|Dragoman           |
|G adventures       |
|Radical            |
|Trek America       |
|1 source           |
|Grand America		|


Scenario Outline: To test sort options 
When user applies sortoption <option>
Then results should be displayed accordingly
Examples: 
|option             |
|recommendation     |
|price(low-high)    |
|price(high-low)    |
|price/day(low-high)|
|price/day(high-low)|
|duration(lowest)   |