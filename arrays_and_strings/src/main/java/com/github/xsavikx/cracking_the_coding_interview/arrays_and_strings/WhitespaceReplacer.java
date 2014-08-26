package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

/**
 * Class for Cracking the coding Interview task 1.4
 * 
 * Description of task(in <b>Russian</b>):Напишите метод, заменяющий все пробелы
 * в строки символами '%20'. Можно предположить, что длина строки позволяет
 * сохранить дополнительные символы и "истинная" длина строки известна.
 * (Примечание: при реализации метода на Java используйте символьный массив.) <br>
 * <i>Пример</i>:<br/>
 * <code>Ввод: "Mr John Smith"<br/>
Вывод: "Mr%20John%20Smith"</code>
 * 
 * @author Iurii Sergiichuk
 *
 */
public class WhitespaceReplacer {
	private static final char WHITESPACE = ' ';

	/**
	 * Replaces whitespace characters of given string to '%20'
	 * 
	 * @param str
	 *            string to replace whitespace characters
	 * @return string with replaced whitespace characters, if has any
	 * @throws IllegalArgumentException
	 *             if str is null
	 */
	public static String replaceWhitespaces(String str) {
		if (str == null) {
			throw new IllegalArgumentException("str cannot be null");
		}
		char[] strChars = str.toCharArray();
		int whitespaceCharsAmount = countWhitespaces(strChars);
		if (whitespaceCharsAmount == 0) {
			return str;
		}
		char[] strCharsWithReplacedWhitespaces = new char[strChars.length
				- whitespaceCharsAmount + whitespaceCharsAmount * 3];
		for (int i = 0, j = 0; i < strChars.length; i++, j++) {
			if (strChars[i] == WHITESPACE) {
				strCharsWithReplacedWhitespaces[j++] = '%';
				strCharsWithReplacedWhitespaces[j++] = '2';
				strCharsWithReplacedWhitespaces[j] = '0';
			} else {
				strCharsWithReplacedWhitespaces[j] = strChars[i];
			}
		}
		return new String(strCharsWithReplacedWhitespaces);
	}

	/**
	 * Counts whitespace characters in given char arrays
	 * 
	 * @param strChars
	 *            char array to count whitespace characters
	 * @return amount of whitespace characters
	 */
	private static int countWhitespaces(char[] strChars) {
		int whitespaceCharsAmount = 0;
		for (char elem : strChars) {
			if (elem == WHITESPACE) {
				whitespaceCharsAmount++;
			}
		}
		return whitespaceCharsAmount;
	}
}
