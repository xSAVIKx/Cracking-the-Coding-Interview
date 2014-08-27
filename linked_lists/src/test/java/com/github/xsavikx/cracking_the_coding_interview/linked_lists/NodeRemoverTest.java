package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.xsavikx.cracking_the_coding_interview.linked_lists.NodeRemover.Node;

public class NodeRemoverTest {
	NodeRemover nr = new NodeRemover();

	@Test
	public void testNodeToString() {
		Node<Character> a = new Node<Character>(null, 'a', null);

		String expected = "Node [item=a, next=null, prev=null]";
		assertEquals(expected, a.toString());
	}

	@Test
	public void testRemove() {
		Node<Character> a = new Node<Character>(null, 'a', null);
		Node<Character> b = new Node<Character>(null, 'b', null);
		Node<Character> c = new Node<Character>(null, 'c', null);
		Node<Character> d = new Node<Character>(null, 'd', null);
		Node<Character> e = new Node<Character>(null, 'e', null);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		NodeRemover.remove(c);
		Node<Character> actual = b.next;
		Node<Character> expected = d;
		assertEquals(expected.item, actual.item);
	}

	@Test
	public void testRemoveLast() {
		Node<Character> a = new Node<Character>(null, 'a', null);
		Node<Character> b = new Node<Character>(null, 'b', null);
		Node<Character> c = new Node<Character>(null, 'c', null);
		Node<Character> d = new Node<Character>(null, 'd', null);
		Node<Character> e = new Node<Character>(null, 'e', null);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		NodeRemover.remove(e);
		Node<Character> actual = d.next;
		Node<Character> expected = null;
		assertEquals(expected, actual.item);
	}

}
