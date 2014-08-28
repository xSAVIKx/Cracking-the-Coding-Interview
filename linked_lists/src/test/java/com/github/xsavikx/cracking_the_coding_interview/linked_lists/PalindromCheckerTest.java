package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PalindromCheckerTest {
	PalindromChecker pc = new PalindromChecker();

	@Test
	public void testIsPalindromTrue() {
		List<Integer> testList = Arrays.asList(1, 2, 3, 2, 1);
		assertTrue(PalindromChecker.isPalindrom(testList));
	}

	@Test
	public void testIsPalindromFalse() {
		List<Integer> testList = Arrays.asList(1, 2, 3, 3, 1);
		assertFalse(PalindromChecker.isPalindrom(testList));
	}

	@Test
	public void testIsPalindromFalseOddLength() {
		List<Integer> testList = Arrays.asList(1, 2, 3, 3, 2, 1);
		assertFalse(PalindromChecker.isPalindrom(testList));
	}
}
