package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings.ImageRotator.Direction;

public class ImageRotatorTest {
	ImageRotator ir = new ImageRotator();

	@Test
	public void testPrintImageMatrix() {

		int[][] imageMatrix = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		ImageRotator.printImageMatrix(imageMatrix);
	}

	@Test
	public void testRotateImageClockwise() {
		int[][] imageMatrix = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int[][] imageMatrixRotatedClockwise = { { 5, 4, 3, 2, 1 },
				{ 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 } };
		assertArrayEquals(imageMatrixRotatedClockwise,
				ImageRotator.rotateImage(imageMatrix, Direction.CLOCKWISE));
	}

	@Test
	public void testRotateImageCounterclockwise() {
		int[][] imageMatrix = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		int[][] imageMatrixRotatedClockwise = { { 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		assertArrayEquals(imageMatrixRotatedClockwise,
				ImageRotator.rotateImage(imageMatrix,
						Direction.COUNTERCLOCKWISE));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRotateImageIllegalArgumentExceptionImageNull() {
		ImageRotator.rotateImage(null, Direction.CLOCKWISE);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRotateImageIllegalArgumentExceptionDirectionNull() {
		int[][] imageMatrix = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 },
				{ 4, 4, 4, 4 }, { 5, 5, 5, 5 } };
		ImageRotator.rotateImage(imageMatrix, null);
	}
}
