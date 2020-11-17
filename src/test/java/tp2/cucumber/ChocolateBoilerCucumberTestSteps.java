package tp2.cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tp2.ChocolateBoiler;

public class ChocolateBoilerCucumberTestSteps {

	private ChocolateBoiler boiler;

	@Given("I create a chocolate boiler")
	public void i_create_a_chocolate_boiler() {
		System.out.println("Creating a chocolate boiler");
		boiler = ChocolateBoiler.getInstance();
		assertTrue(boiler instanceof ChocolateBoiler);
	}

	@Then("I fill the boiler")
	public void i_fill_the_boiler() {
		System.out.println("Filling the boiler");
		boiler.fill();
	}

	@Then("I boil the boiler")
	public void i_boil_the_boiler() {
		System.out.println("Boiling the boiler");
		boiler.boil();
	}

	@Then("I empty the boiler")
	public void i_empty_the_boiler() {
		System.out.println("Emptying the boiler");
		boiler.empty();
	}

	@Then("I check that the boiler is {string} and {string}")
	public void i_check_the_boiler_state(String boiledState, String emptyState) throws Exception {
		System.out.println("Checking that the boiler is " + boiledState + " and " + emptyState);

		if ("boiled".equals(boiledState)) {
			assertTrue(boiler.isBoiled());
		} else if ("not boiled".equals(boiledState)) {
			assertFalse(boiler.isBoiled());
		} else {
			throw new Exception("You must use 'boiled' or 'not boiled'");
		}

		if ("empty".equals(emptyState)) {
			assertTrue(boiler.isEmpty());
		} else if ("not empty".equals(emptyState)) {
			assertFalse(boiler.isEmpty());
		} else {
			throw new Exception("You must use 'empty' or 'not empty'");
		}
	}
}
