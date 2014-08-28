package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.HashSet;

/**
 * Class for Cracking the coding Interview task 2.6
 * 
 * Description of task(in <b>Russian</b>): Для кольцевого связного списка
 * реализуйте алгоритм, возвращающий начальный узел петли.<br/>
 * <i>Определение</i><br/>
 * Кольцевой связный список - это связный список, в котором указатель
 * последующего узла связан с более ранним узлом, образуя петлю.<br/>
 * <i>Пример</i><br/>
 * Ввод: <code>A->B->C->D->E->C->(Предыдущий узел C)</code><br/>
 * Вывод: <code>C</code>
 * 
 * @author Iurii Sergiichuk
 *
 */
public class LoopNodeFinder {
	/**
	 * Node implementation
	 * 
	 * @author Iurii Sergiichuk
	 *
	 * @param <E>
	 */
	public static class Node<E> {
		public E item;
		public Node<E> next;

		Node(E element, Node<E> next) {
			this.item = element;
			this.next = next;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [item=");
			builder.append(item);
			builder.append(", next=");
			if (next != null) {
				builder.append(next.item);
			} else {
				builder.append("null");
			}
			builder.append("]");
			return builder.toString();
		}

	}

	/**
	 * Finds node from what the loop starts
	 * 
	 * @param head
	 *            head of looped-list
	 * @return node from what the loop starts or <tt>null</tt>, if no loop where
	 *         found
	 */
	public static <E> Node<E> getLoopNode(Node<E> head) {
		Node<E> n = head.next;

		HashSet<Node<E>> setOfNodes = new HashSet<>();
		while (n.next != null) {
			if (!setOfNodes.add(n)) {
				return n;
			}
			n = n.next;
		}
		return null;

	}

}
