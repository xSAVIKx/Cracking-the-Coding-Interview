package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.*;

import org.junit.Test;
import com.github.xsavikx.cracking_the_coding_interview.linked_lists.LoopNodeFinder.Node;

public class LoopNodeFinderTest {
	LoopNodeFinder lnf = new LoopNodeFinder();

	@Test
	public void testNodeToString() {

		Node<Character> b = new Node<Character>('B', null);
		Node<Character> a = new Node<Character>('A', b);
		String aExpected = "Node [item=A, next=B]";
		assertEquals(aExpected, a.toString());
		String bExpected = "Node [item=B, next=null]";
		assertEquals(bExpected,b.toString());
	}

	@Test
	public void testGetLoopNode() {
		Node<Character> a = new Node<Character>('A', null);
		Node<Character> b = new Node<Character>('B', null);
		Node<Character> c = new Node<Character>('C', null);
		Node<Character> d = new Node<Character>('D', null);
		Node<Character> e = new Node<Character>('E', null);
		Node<Character> c2 = new Node<Character>('C', null);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c2;
		c2.next = c;
		assertEquals(c, LoopNodeFinder.getLoopNode(a));
	}

	@Test
	public void testGetLoopNodeNull() {
		Node<Character> a = new Node<Character>('A', null);
		Node<Character> b = new Node<Character>('B', null);
		Node<Character> c = new Node<Character>('C', null);
		Node<Character> d = new Node<Character>('D', null);
		Node<Character> e = new Node<Character>('E', null);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		assertNull(LoopNodeFinder.getLoopNode(a));
	}

}
