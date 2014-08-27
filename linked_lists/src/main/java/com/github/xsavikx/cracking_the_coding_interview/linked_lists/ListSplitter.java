package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class for Cracking the coding Interview task 2.4
 * 
 * Description of task(in <b>Russian</b>): Напишите код, разбивающий связный
 * список вокруг значения <code>x</code>, так чтобы все узлы, меньшие
 * <code>x</code>, оказались перед узлами, большими или равными <code>x</code>
 * 
 * @author Iurii Sergiichuk
 *
 */
public class ListSplitter {
	/**
	 * Split given list on Node, so that result list will contain firstly values
	 * smaller than Node and after them all Nodes bigger or equal
	 * 
	 * @param list
	 *            list to be splitted
	 * @param node
	 *            Node to split list at
	 * @return splitted list
	 */
	public static <T extends Comparable<T>> List<T> sortByNode(List<T> list,
			T node) {
		List<T> beforeList = new LinkedList<>();
		Iterator<T> iterator = list.iterator();
		while (iterator.hasNext()) {
			T elem = iterator.next();
			if (elem.compareTo(node) < 0) {
				beforeList.add(elem);
				iterator.remove();
			}
		}
		beforeList.addAll(list);
		return beforeList;
	}
}
