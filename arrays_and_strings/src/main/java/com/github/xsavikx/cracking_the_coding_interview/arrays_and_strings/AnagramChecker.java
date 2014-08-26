package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import java.util.Arrays;

/**
 * Class for Cracking the coding Interview task 1.3
 * 
 * Description of task(in <b>Russian</b>): Для двух строк напишите метод,
 * определяющий, является ли одна строка перестановкой другой.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class AnagramChecker {
	/**
	 * Check whether one string is Anagram to another one
	 * 
	 * @param str1
	 *            first string
	 * @param str2
	 *            second string
	 * @return true, if str1 is anagram to str2
	 */
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		char[] strOneChars = str1.toLowerCase().toCharArray();
		char[] strTwoChars = str2.toLowerCase().toCharArray();
		Arrays.sort(strOneChars);
		Arrays.sort(strTwoChars);
		return Arrays.equals(strOneChars, strTwoChars);
	}
}
