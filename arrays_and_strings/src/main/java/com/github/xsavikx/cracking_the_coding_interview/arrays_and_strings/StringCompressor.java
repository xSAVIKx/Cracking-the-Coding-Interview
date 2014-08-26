package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

/**
 * Class for Cracking the coding Interview task 1.5
 * 
 * Description of task(in <b>Russian</b>):Реализуйте метод, осуществляющий
 * сжатие строки, на основе счетчика повторяющихся символов. Например, строка
 * <code>aabcccccaaa</code> должна превратиться в <code>a2b1c5a3</code>. Если
 * "сжатая" строка оказывается длиннее исходной, метод должен вернуть исходную
 * строку.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class StringCompressor {
	/**
	 * Compresses given string with counter recurring characters
	 * 
	 * @param str
	 *            string to be compressed
	 * @return compressed string, if its uncompressed length is bigger that its
	 *         compressed length, otherwise - return original string
	 * @throws IllegalArgumentException
	 *             if given str == null
	 */
	public static String compressString(String str) {
		if (str == null) {
			throw new IllegalArgumentException("str cannot be null");
		}
		if (str.isEmpty()) {
			return str;
		}
		StringBuilder sb = new StringBuilder();
		char lastChar = str.charAt(0);
		sb.append(lastChar);
		int sameCharsAmount = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == lastChar) {
				sameCharsAmount++;
			} else {
				sb.append(sameCharsAmount);
				lastChar = str.charAt(i);
				sb.append(lastChar);
				sameCharsAmount = 1;
			}
		}
		sb.append(sameCharsAmount);
		if (sb.length() < str.length()) {
			return sb.toString();
		}
		return str;
	}
}
