package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColumnAndRowReseterTest {
	ColumnAndRowReseter carr = new ColumnAndRowReseter();

	@Test
	public void testSetColumnAndRowToZero() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 2, 2, 0, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int[][] zeroedMatrix = { { 1, 1, 0, 1 }, { 0, 0, 0, 0 },
				{ 3, 3, 0, 3 }, { 4, 4, 0, 4 }, { 5, 5, 0, 5 } };
		int M = 1;
		int N = 2;
		assertArrayEquals(zeroedMatrix,
				ColumnAndRowReseter.setColumnAndRowToZero(matrix, M, N));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetColumnAndRowToZeroIllegalArgumentExceptionMsmallerThanZero() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 2, 2, 0, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int M = -1;
		int N = 2;
		ColumnAndRowReseter.setColumnAndRowToZero(matrix, M, N);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetColumnAndRowToZeroIllegalArgumentExceptionNsmallerThanZero() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 2, 2, 0, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int M = 1;
		int N = -2;
		ColumnAndRowReseter.setColumnAndRowToZero(matrix, M, N);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetColumnAndRowToZeroIllegalArgumentExceptionMbiggerThanMatrix() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 2, 2, 0, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int M = 6;
		int N = 3;
		ColumnAndRowReseter.setColumnAndRowToZero(matrix, M, N);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetColumnAndRowToZeroIllegalArgumentExceptionNbiggerThanMatrix() {
		int[][] matrix = { { 1, 1, 1, 1 }, { 2, 2, 0, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int M = 3;
		int N = 5;
		ColumnAndRowReseter.setColumnAndRowToZero(matrix, M, N);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetColumnAndRowToZeroIllegalArgumentExceptionMatrixNull() {
		int[][] matrix = null;
		ColumnAndRowReseter.setColumnAndRowToZero(matrix, 1, 2);
	}

}
