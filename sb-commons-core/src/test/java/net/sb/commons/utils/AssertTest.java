package net.sb.commons.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEmpty() {
		assertTrue(Assert.isEmpty(null));
		assertTrue(Assert.isEmpty(""));
		assertFalse(Assert.isEmpty("ciao"));
	}

	@Test
	public void testIsNotEmpty() {
		assertFalse(Assert.isNotEmpty(null));
		assertFalse(Assert.isNotEmpty(""));
		assertTrue(Assert.isNotEmpty("ciao"));
	}

}
