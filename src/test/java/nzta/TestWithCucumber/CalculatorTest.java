package nzta.TestWithCucumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void testSixdividedbyTwoReturnsThree() {
		final int expected = 3;

		final int actual = calculator.divide(6, 2);

		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSixdividedbyZeroThenExceptionThrown() {
		calculator.divide(6, 0);
	}
	
	@Test
	public void testMinusSevendividedbyTwoReturnsMinusThree() {
		final int expected = -3;

		final int actual = calculator.divide(-7, 2);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSixdividedbyMinusTwoReturnsMinusThree() {
		final int expected = -3;

		final int actual = calculator.divide(6, -2);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinusSixdividedbyMinusTwoReturnsThree() {
		final int expected = 3;

		final int actual = calculator.divide(-6, -2);

		assertEquals(expected, actual);
	}
}
