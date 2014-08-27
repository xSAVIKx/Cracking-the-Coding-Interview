package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class ElementFinderTest {
	ElementFinder ef = new ElementFinder();

	@Test
	public void testFindNthFromTail() {
		LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(1, 2, 3,
				4, 5, 6));
		Integer secondElementFromEnd = 5;
		assertEquals(secondElementFromEnd,
				ElementFinder.findNthFromTail(testList, 2));
	}

	@Test
	public void testFindNthFromTailReturnNull() {
		LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(1, 2, 3,
				4, 5, 6));
		assertNull(ElementFinder.findNthFromTail(testList, 8));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindNthFromTailIllegalArgumentException() {
		ElementFinder.findNthFromTail(null, -1);
	}

}
