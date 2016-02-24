package cse360assign3;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
/*
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		int test = calc.getTotal();
		assertEquals(test, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(3);
		calc.subtract(5);
		assertEquals(-8, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(3);
		calc.subtract(1);
		assertEquals(29, calc.getTotal());
	}
/*
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(52);
		calc.divide(2);
		assertEquals(26, calc.getTotal());
		//calc.subtract(26);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
*/
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(52);
		calc.divide(2);
		calc.subtract(6);
		calc.multiply(5);
		assertEquals("0 + 52 / 2 - 6 * 5", calc.getHistory());
		calc.getHistory();
	}
}
