package tp2.unit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import tp2.ChocolateBoiler;

public class ChocolateBoilerTest {

	@Test
	public void test1() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.reset();
		
		assertFalse(boiler.isBoiled());
		assertTrue(boiler.isEmpty());
	}

	@Test
	public void test2() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		
		assertFalse(boiler.isBoiled());
		assertFalse(boiler.isEmpty());
	}

	@Test
	public void test3() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		
		assertTrue(boiler.isBoiled());
		assertFalse(boiler.isEmpty());
	}

	@Test
	public void test4() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.empty();
		
		assertTrue(boiler.isBoiled());
		assertTrue(boiler.isEmpty());
	}
}
