package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

/**
 * Class for Cracking the coding Interview task 1.1
 * 
 * Description of task(in <b>Russian</b>): Реализуйте алгоритм, определяющий все
 * ли символы в строке встречаются один раз. При выполнении этого задания нельзя
 * использовать дополнительные структуры данных.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class UniqueChecker {
	/**
	 * Check if all characters in given string are unique
	 * 
	 * @param str
	 *            String to check characters
	 * @return true, if all characters in given string are unique, otherwise -
	 *         false
	 */
	public static boolean areCharsInStringUnique(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
