package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhitespaceReplacerTest {
	WhitespaceReplacer wr = new WhitespaceReplacer();

	@Test(expected = IllegalArgumentException.class)
	public void testReplaceWhitespacesIllegalArgumentException() {
		WhitespaceReplacer.replaceWhitespaces(null);
	}

	@Test
	public void testReplaceWhitespacesSameString() {
		String str = "str";
		assertEquals(str, WhitespaceReplacer.replaceWhitespaces(str));
	}

	@Test
	public void testReplaceWhitespacesReplacedString() {
		String strWithWhitespaces = "str with whitespaces";
		String strWithWhitespacesReplaced = "str%20with%20whitespaces";
		assertEquals(strWithWhitespacesReplaced,
				WhitespaceReplacer.replaceWhitespaces(strWithWhitespaces));
	}

}
