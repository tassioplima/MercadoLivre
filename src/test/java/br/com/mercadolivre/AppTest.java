package br.com.mercadolivre;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public void testApp() {
		assertTrue(true);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
}
