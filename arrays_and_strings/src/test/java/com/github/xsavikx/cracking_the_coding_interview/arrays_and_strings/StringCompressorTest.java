package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressorTest {
	StringCompressor sc = new StringCompressor();

	@Test(expected = IllegalArgumentException.class)
	public void testCompressStringIllegalArgumentException() {
		StringCompressor.compressString(null);
	}

	@Test
	public void testCompressStringSameStringAsEmpty() {
		String emptyString = "";
		assertEquals(emptyString, StringCompressor.compressString(emptyString));
	}

	@Test
	public void testCompressStringSameString() {
		String stringWithCompressedBiggerValue = "ab";
		assertEquals(stringWithCompressedBiggerValue,
				StringCompressor
						.compressString(stringWithCompressedBiggerValue));
	}

	@Test
	public void testCompressStringCompressedString() {
		String str = "aabcccccaaa";
		String expected = "a2b1c5a3";
		assertEquals(expected, StringCompressor.compressString(str));
	}
}
