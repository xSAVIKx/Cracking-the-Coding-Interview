package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListNumbersAdderTest {
	ListNumbersAdder lna = new ListNumbersAdder();

	@Test
	public void testAddReversedListNumber() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(2, 1, 9));
		List<Integer> firstNum = new LinkedList<>(Arrays.asList(7, 1, 6));
		List<Integer> secondNum = new LinkedList<>(Arrays.asList(5, 9, 2));
		assertArrayEquals(expected.toArray(), ListNumbersAdder
				.addReversedListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddReversedListNumberEmptyList() {
		List<Integer> expected = new LinkedList<>();
		List<Integer> firstNum = new LinkedList<>();
		List<Integer> secondNum = new LinkedList<>();
		assertArrayEquals(expected.toArray(), ListNumbersAdder
				.addReversedListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddReversedListNumberFirstNumberIsEmpty() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> firstNum = new LinkedList<>();
		List<Integer> secondNum = new LinkedList<>(Arrays.asList(5, 9, 2));
		assertArrayEquals(expected.toArray(), ListNumbersAdder
				.addReversedListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddReversedListNumberSecondNumberIsEmpty() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> firstNum = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> secondNum = new LinkedList<>();
		assertArrayEquals(expected.toArray(), ListNumbersAdder
				.addReversedListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddListNumber() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(9, 1, 2));
		List<Integer> firstNum = new LinkedList<>(Arrays.asList(6, 1, 7));
		List<Integer> secondNum = new LinkedList<>(Arrays.asList(2, 9, 5));
		assertArrayEquals(expected.toArray(),
				ListNumbersAdder.addListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddListNumberEmptyList() {
		List<Integer> expected = new LinkedList<>();
		List<Integer> firstNum = new LinkedList<>();
		List<Integer> secondNum = new LinkedList<>();
		assertArrayEquals(expected.toArray(),
				ListNumbersAdder.addListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddListNumberFirstNumberIsEmpty() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> firstNum = new LinkedList<>();
		List<Integer> secondNum = new LinkedList<>(Arrays.asList(5, 9, 2));
		assertArrayEquals(expected.toArray(),
				ListNumbersAdder.addListNumber(firstNum, secondNum).toArray());
	}

	@Test
	public void testAddListNumberSecondNumberIsEmpty() {
		List<Integer> expected = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> firstNum = new LinkedList<>(Arrays.asList(5, 9, 2));
		List<Integer> secondNum = new LinkedList<>();
		assertArrayEquals(expected.toArray(),
				ListNumbersAdder.addListNumber(firstNum, secondNum).toArray());
	}
}
