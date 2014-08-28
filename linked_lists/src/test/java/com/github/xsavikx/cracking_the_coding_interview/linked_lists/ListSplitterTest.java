package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListSplitterTest {
	ListSplitter ls = new ListSplitter();

	@Test
	public void testSortByNodeFive() {
		List<Integer> testList = new LinkedList<>(Arrays.asList(1, 3, 5, 2, 12,
				4, 10));
		List<Integer> expected = new LinkedList<>(Arrays.asList(1, 3, 2, 4, 5,
				12, 10));
		assertArrayEquals(expected.toArray(),
				ListSplitter.sortByNode(testList, 5).toArray());
	}
}
