package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class for Cracking the coding Interview task 2.2
 * 
 * Description of task(in <b>Russian</b>): Реализуйте алгоритм для поиска в
 * односвязном списке <code>k-го</code> элемента с <code>конца</code>.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class ElementFinder {
	/**
	 * Finds N element from tail of given list
	 * 
	 * @param list
	 *            list to find element in
	 * @param n
	 *            index of element from tail of given list
	 * @return element on N (from tail) position or null if given N is bigger
	 *         than list.size()
	 * @throws IllegalArgumentException
	 *             if given N is smaller than 1
	 */
	public static <E> E findNthFromTail(final LinkedList<E> list, int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Cannot find element with n="
					+ n);
		}
		Collections.reverse(list);
		Iterator<E> iterator = list.iterator();
		int i = 1;
		while (i < n && iterator.hasNext()) {
			iterator.next();
			i++;
		}
		if (i == n && iterator.hasNext())
			return iterator.next();
		else
			return null;
	}
}
