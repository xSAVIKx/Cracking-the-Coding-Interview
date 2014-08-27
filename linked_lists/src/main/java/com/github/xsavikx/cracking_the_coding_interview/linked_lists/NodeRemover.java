package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

public class NodeRemover {
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
