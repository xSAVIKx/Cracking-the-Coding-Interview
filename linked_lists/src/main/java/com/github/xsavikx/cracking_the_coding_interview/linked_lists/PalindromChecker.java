package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.List;

/**
 * Class for Cracking the coding Interview task 2.7
 * 
 * Description of task(in <b>Russian</b>): Реализуйте фунцию, проверяющую,
 * является ли связный список палиндромом.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class PalindromChecker {

	/**
	 * Check if given list is palindrom within its elements
	 * 
	 * @param listToCheck
	 *            list to be checked
	 * @return true, if given list elements are palindrom
	 */
	public static <E> boolean isPalindrom(List<E> listToCheck) {
		int listSize = listToCheck.size();
		if ((listSize & 1) == 0)
			return false;
		@SuppressWarnings("unchecked")
		E[] valuesArray = (E[]) listToCheck.toArray();
		for (int i = 0, j = listSize - 1; i < listSize >> 1
				&& j > listSize >> 1; i++, j--) {
			if (!valuesArray[i].equals(valuesArray[j])) {
				return false;
			}
		}
		return true;
	}

}
