# Selenium-BDD-TestNG-Java-Automation

The automation test scripts are created in a framework with minimal features, using Cucumber-JVM and TestNG.

## Pre-requisites

* [Java](https://java.com/en/download/manual.jsp)
* [Maven](https://maven.apache.org/download.cgi)
* [Eclipse](https://eclipse.org/downloads/)
	* Plugins for Eclipse
		* [Cucumber](http://download.eclipse.org/technology/m2e/releases/latest/)
		* [Maven](http://download.eclipse.org/technology/m2e/releases/latest/)
	
## Setting up the framework(for Windows)

* Install Java and set path in environment variables.
* Install Maven and set path in environment variables.
* Clone the repository or download zip.

## Steps to run the tests
* Open command prompt
* Goto project location.
* Use "mvn clean test" command to run scenarios in feature file.

## Framework Structure

![Framework structure](/Doc/Framework_Structure.png)
   
## Further improvements
* Capability to run tests in multiple browsers can be added(As of now by default running tests in the Chrome browser)
* Can add multi-threading to enable parallel runs. Driver instances and data can be assigned in threads for parallel runs.
	* If we are considering parallel runs, apart from desktop browsers, we can add capability to run test in mobile web browsers(Android and iOS) as well
* TestNG listener can be added to get parameters specific to run configurations.
* Can add a separate package to create reusable methods(Com.Test.Levin.modules) and call them in step definitions
* Capability to reset inner width and height of browser window can be added in case multiple view ports need to be validated
* Capability to pass huge data from external sources like CSV/EXCEL/JSON/XML files(based on the requirement) to enable data based test runs
* Can create multiple profiles in pom.xml, which would allow us to choose and run the required test suites.
* Additional reporting libraries like Allure reports or Extent reports can be added 

Note: The steps in the feature file are written in detail to enable steps reusability when different scenarios need to be automated by covering all options in the test flows.

Execution report for below scenarios:

Scenario1 : Order T-Shirt (And verify in Order History)
Scenario2 : Update Personal Information (First Name) in My Account

Cucumber report is available in target\cucumber-reports\cucumber-pretty\index.html
![Execution report](/Doc/Report.png)
