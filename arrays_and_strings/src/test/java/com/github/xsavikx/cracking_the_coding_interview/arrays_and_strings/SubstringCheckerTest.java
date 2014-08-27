package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubstringCheckerTest {
	SubstringChecker sc = new SubstringChecker();

	@Test
	public void testIsSubstringFalseNoteEqualLength() {
		String str1 = "str1";
		String strStr = "strStr";
		assertFalse(SubstringChecker.isSubstring(str1, strStr));
	}

	@Test
	public void testIsSubstringFalseNotSubstring() {
		String str1 = "str1";
		String str2 = "str2";
		assertFalse(SubstringChecker.isSubstring(str1, str2));
	}

	@Test
	public void testIsSubstringTrue() {
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		assertTrue(SubstringChecker.isSubstring(str1, str2));
	}

}
