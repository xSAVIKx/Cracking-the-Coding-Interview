package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramCheckerTest {

	@Test
	public void testIsAnagramTrue() {
		String god = "god";
		String dog = "DOG";
		assertTrue("", AnagramChecker.isAnagram(god, dog));
	}

	@Test
	public void testIsAnagramFalse() {
		String str1 = "str1";
		String str2 = "str2";
		assertFalse("", AnagramChecker.isAnagram(str1, str2));
	}
}
