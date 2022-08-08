Feature: Hotel In Adactin Application

Scenario: Login Page

Given user Launch The Application

When user Enter The  User name field

And user Enter The Password Field

Then user Click The Login Button And It navigate To Hotel Selection Page

Scenario: Search Hotel Page

When user Enter The Hotel Location

And user Select The Hotel

And user Select The Room Type

And user Select The Number of Rooms Required

And user Select The Check In Date

And user Select The Check Out Data

And user Select The Number of Adults per Room

And user Select The Number of Children per Room

Then user Click The Search Button And It Navigate To Select Hotel Page


Scenario: Hotel Selection Page

When user Click The Radio Button

Then user Click The Condition Button And It Navigate To Back A Hotel Page


Scenario: Book A Hotel Page

When user Enter The FirstNamr In The FirstName Field

When Enter The LastName In The LastName Field

And user Enter The Billing Address In The Billing Address Field

And user Enter The Credit card Number In The Credit card Number Field

And user enter The Credit card Type In The Credit card Type Field

And user Select  The Expire Month And Year In the Expert Date Field

And user Enter The Cvv Book In The Cvv Number Field

Then user  Enter The Book Now Button And It Navigate To The Booking Confirmation Page