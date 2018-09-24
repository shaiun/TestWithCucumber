package nzta.TestWithCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

	private Calculator calculator;

	private int actualQuotient;
	private Exception actualException;

	@Given("^I have a Calculator$")
	public void intializeCalculator() {
		this.calculator = new Calculator();
	}

	@When("^I divide (-?\\d+) by (-?\\d+)$")
	public void whenIAddTwoNumbers(int firstNumber, int secondNumber) {
		this.actualQuotient = this.calculator.divide(firstNumber, secondNumber);
	}

	@Then("^the quotient should be (-?\\d+)$")
	public void thenTheSumShouldBe(int expectedquotient) {
		assertEquals(expectedquotient, this.actualQuotient);
	}

	@When("^I divide (-?\\d) by zero$")
	public void whenIAddTwoNumbers(int number) {
		try {
			this.actualQuotient = this.calculator.divide(number, 0);
		} catch (Exception e) {
			actualException = e;
		}
	}

	@Then("^I got Exception (.+)")
	public void iGotArithmeticException(String expectedException) throws Throwable {
		assertEquals("Exception MissMatch", expectedException, actualException.getClass().getSimpleName());
	}

}