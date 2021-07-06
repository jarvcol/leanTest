# LeanTechTest

Hello!!

Here you can find the automation test of the assignment

Project is made basically using:
  - Java 8
  - Cucumber
  - Junit
  - Selenium
  - Maven

There is one feature:
  - Saucedemo.feature : It is testing the required functionalities for the challenge. The commented scenarios are 
    part of the requirement but are not automated.

There is a file called Configuration.properties in the resources directory. In this file it can be configured:
  - Web browser for the test
  - Default time out time
  - Test environment (currently only one called PROD is configured)
  - URL for each environment

Depending on the IDE used and the plugins the project can be run either:
- Running directly the features or scenarios (will run features or scenarios by demand)
- Running the test runner class (RunCucumberTest, will run sequentialy the features)
- Using maven (will run test in parallel and create a more friendly report):
  * mvn clean compile (to clean a compile the project)
  * mvn verify (to actually run the test)

Reports can be found in the target folder once executed (depending on the way you execute the test different reports may appear). 
There are multiple reports but best one should be located in ..target/cucumber-report-html/cucumber-html-reports



Regards.

