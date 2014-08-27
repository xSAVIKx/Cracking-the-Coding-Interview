package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

/**
 * Class for Cracking the coding Interview task 2.1
 * 
 * Description of task(in <b>Russian</b>): Напишите код, удаляющий дубликаты из
 * несортированного связного списка. Дополнительно Как вы будете решать задачу,
 * если запрещается использовать временный буфер?
 * 
 * @author Iurii Sergiichuk
 *
 */
public class DuplicateRemover {
	/**
	 * Removes duplicates from given List. This method use temp buffer.
	 * 
	 * @param list
	 *            list to remove duplicates from
	 * @return list, without duplicates
	 */
	public static <E> LinkedList<E> removeDuplicate(LinkedList<E> list) {
		Set<E> set = new HashSet<E>(list);
		return new LinkedList<E>(set);
	}

	/**
	 * Removes duplicates from given List. This method dont use temporary
	 * buffer.
	 * 
	 * @param list
	 *            list to remove duplicates from
	 * @return list, without duplicates
	 */
	public static <E> LinkedList<E> removeDuplicateWithoutBuffer(
			LinkedList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			E currentItem = list.get(i);
			ListIterator<E> removeIterator = list.listIterator(i + 1);
			while (removeIterator.hasNext()) {
				E itemToRemove = removeIterator.next();
				if (currentItem.equals(itemToRemove)) {
					removeIterator.remove();
				}
			}
		}
		return list;
	}
}
