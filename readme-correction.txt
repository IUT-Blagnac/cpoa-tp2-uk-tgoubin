STRUCTURE

src/main/java

	- ChocolateBoiler.java
		the singleton "ChocolateBoiler"
		I add a method "reset()" which set "empty" and "boiled" attributes to the default values


src/test/java

	- package tp2.unit

		- ChocolatBoilerTest.java
			The unit tests for ChocolateBoiler, with 4 tests

	- package tp2.cucumber
	
		- RunCucumberTests.java
			the runner for the cucumber tests
		
		- ChocolateBoilerCucumberTestSteps.java
			the implementation of the steps used in "src/test/resources/tp2/cucumber/chocolateBoiler.feature"
			
			
src/test/resources

	- folder tp2/cucumber
		The path must be THE SAME that the tp2.cucumber package path
		
		- chocolateBoiler.feature
			The feature file for the chocolate boiler cucumber tests			
			Each scenario corresponds to one of the tests implemented in "ChocolateBoilerTest.java"
			The last scenario regroups all the 4 tests 
			
-------------------------------------------------------------------------------------------------------------------

HOW IT WORKS

	N.B. Structure of a feature file : [feature] 1 - N [scenario] 1 - N [step]

	Open "ChocolateBoilerCucumberTestSteps.java" and "chocolatBoiler.feature" and compare their content
	
	"chocolatBoiler.feature" has 36 lines, but use only 5 different steps
	- Given I get the chocolate boiler
	- And I fill the boiler
	- And I boil the boiler
	- And I empty the boiler
	- Then I check that the boiler is ? and ?
	
	Each step has its corresponding Java definition, with a dedicated method :
	
	"Given I get the chocolate boiler" -> @Given("I get the chocolate boiler") public void i_create_a_chocolate_boiler();
		The method name is not important. The important information is the content of the annotation, which must be the same than
		the step.
	
	"And I boil the boiler" -> @Then("I fill the boiler") public void i_fill_the_boiler();
		The keyword "And" can be associated with @Then, @When...
		
	"Then I check that the boiler is ? and ?" 
	-> @Then("I check that the boiler is {string} and {string}") public void i_check_the_boiler_state(String boiledState, String emptyState)
		By using {a_type} and parameters in the method signature, you can use variables in the step.

-------------------------------------------------------------------------------------------------------------------

LAUNCH THE CUCUMBER TESTS

	With Eclipse
		-> Run configurations
		-> JUnit -> New configuration
		-> Choose "Run all tests in the selected project, package or source folder"
		-> Select "src/test/java"
		-> Test runner: JUnit 4
	
	With Maven
		In a command prompt : 
		$ mvn clean test