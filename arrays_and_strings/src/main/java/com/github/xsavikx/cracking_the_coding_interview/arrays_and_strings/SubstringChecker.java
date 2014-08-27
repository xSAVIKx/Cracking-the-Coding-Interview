package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

/**
 * Class for Cracking the coding Interview task 1.8
 * 
 * Description of task(in <b>Russian</b>): Допустим, что существует метод
 * isSubstring, проверяющий, является ли одно слово подстрокой другого. Для двух
 * строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим
 * сдвигом s1, используя только один вызов метода isSubstring (пример: слово
 * waterbottle получено циклическим сдвигом erbottlewat
 * 
 * @author Iurii Sergiichuk
 *
 */
public class SubstringChecker {

	/**
	 * Check if given strToCheck is cyclic shifted substring of original string
	 * 
	 * @param strToCheck
	 *            string to be checked
	 * @param original
	 *            original string
	 * @return true, if given strToCheck is substring of original string
	 */
	public static boolean isSubstring(String strToCheck, String original) {
		if (strToCheck.length() != original.length()) {
			return false;
		}
		StringBuilder sb = new StringBuilder(original);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.toString().equalsIgnoreCase(strToCheck)) {
				return true;
			} else {
				sb.insert(0, sb.charAt(sb.length() - 1)).deleteCharAt(
						sb.length() - 1);
			}
		}
		return false;
	}
}
