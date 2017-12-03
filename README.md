# MagicMouse

## Project Description

Selenium Test Automation Framework for Buying a Magic Mouse on http://store.demoqa.com/ written in Java

Technologies used:

Selenium 3.8.0
Maven 3.7.0
TestNG 6.13.1
log4j 1.2.17

Supported OS platform: windows, macOS

Supported Web Browser: Chrome, Firefox


## Framwork Prerequisites

Mac/Windows envinroment
Java 1.9
Maven 3.7
Firefox and Chrome installed in your Mac/Windows computer

## Usage

For running the test, just execute command: mvn clean package

## Logging / Reporting

For reports, go to target/surefile-reports
For logs, go to log4j-logfiles



## Test Documentation

STEP 1: Go to http://store.demoqa.com/

STEP 2: Go to Product category and select Accessories

STEP 3: Click on “Add to Cart” for just Magic Mouse

STEP 4: Click on “Checkout” and confirm you have 1 Magic Mouse in your Check-Out Page

STEP 5: After confirming, click on Continue

STEP 6: Enter test data needed for email,  billing/contact details and billing/contact details and click Purchase

STEP 7: Confirm that you have placed the Order in ‘Transaction Results’ page

