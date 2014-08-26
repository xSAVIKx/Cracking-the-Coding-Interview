package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCheckerTest {

	@Test
	public void testAreCharsInStringUniqueTrue() {
		String strToCheck = "qwerty1";
		assertTrue("Characters in given string are not unique",
				UniqueChecker.areCharsInStringUnique(strToCheck));
	}

	@Test
	public void testAreCharsInStringUniqueFalse() {
		String strToCheck = "qwertyq";
		assertFalse("Characters in given string are unique",
				UniqueChecker.areCharsInStringUnique(strToCheck));
	}

}
