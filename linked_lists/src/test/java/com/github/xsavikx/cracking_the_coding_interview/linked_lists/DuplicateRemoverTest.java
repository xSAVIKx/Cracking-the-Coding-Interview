package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class DuplicateRemoverTest {
	DuplicateRemover dr = new DuplicateRemover();

	@Test
	public void testRemoveDuplicate() {
		LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1, 2, 3,
				4));
		LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(1, 2, 3,
				4, 4, 4, 4));
		assertArrayEquals(expected.toArray(),
				DuplicateRemover.removeDuplicate(testList).toArray());
	}

	@Test
	public void testRemoveDuplicateWithoutBuffer() {
		LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(1, 2, 3,
				4));
		LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(1, 2, 3,
				4, 4, 4, 4));
		assertArrayEquals(expected.toArray(), DuplicateRemover
				.removeDuplicateWithoutBuffer(testList).toArray());
	}

}
