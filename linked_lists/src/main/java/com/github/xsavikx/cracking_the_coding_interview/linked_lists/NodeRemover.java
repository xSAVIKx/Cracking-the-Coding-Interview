package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

/**
 * Class for Cracking the coding Interview task 2.3
 * 
 * Description of task(in <b>Russian</b>): Реализуйте алгоритм, удаляющий узел
 * из середины односвязного списка(доступ дан только к этому узлу).<br/>
 * <i>Пример</i><br/>
 * Ввод: узел <code>c</code> из списка <code>a->b->c->d->e</code><br/>
 * Вывод: ничего не возвращается, но новый список имеет вид:
 * <code>a->b->d->e</code>
 * 
 * @author Iurii Sergiichuk
 *
 */
public class NodeRemover {
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
		public Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
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

			builder.append(", prev=");
			if (prev != null) {
				builder.append(prev.item);
			} else {
				builder.append("null");
			}
			builder.append("]");
			return builder.toString();
		}

	}

	/**
	 * Removes given node from node-sequence
	 * 
	 * @param nodeToRemove
	 *            node to be removed
	 */
	public static <E> void remove(Node<E> nodeToRemove) {
		if (nodeToRemove != null) {
			Node<E> next = nodeToRemove.next;
			if (next != null) {
				nodeToRemove.item = next.item;
				nodeToRemove.next = next.next;
			} else {
				nodeToRemove.item = null;
				nodeToRemove.next = null;
			}
		}
	}
}
