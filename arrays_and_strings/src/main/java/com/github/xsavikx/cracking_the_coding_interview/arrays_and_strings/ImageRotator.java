package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

/**
 * Class for Cracking the coding Interview task 1.6
 * 
 * Description of task(in <b>Russian</b>): Дано: изображение в виде матрицы
 * размером N x N, где каждый пиксель занимает 4 байта. Напишите метод,
 * поворачивающий изображение на 90°.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class ImageRotator {

	public static enum Direction {
		CLOCKWISE, COUNTERCLOCKWISE;
	}

	/**
	 * Makes given image matrix to given direction 90-degree rotation. Matrix
	 * should be rectangle or square, if not - unpredictable behavior.
	 * 
	 * @param imageMatrix
	 *            matrix to rotate
	 * @return rotated to given direction matrix
	 */
	public static int[][] rotateImage(int[][] imageMatrix, Direction direction) {
		if (imageMatrix == null || direction == null) {
			throw new IllegalArgumentException(
					"imageMatrix and direction cannot be null");
		}
		int[][] rotatedImageMatrix = new int[imageMatrix[0].length][];
		for (int i = 0; i < rotatedImageMatrix.length; i++) {
			rotatedImageMatrix[i] = new int[imageMatrix.length];
		}
		switch (direction) {
		case CLOCKWISE:
			for (int i = 0; i < imageMatrix.length; i++) {
				for (int j = 0; j < imageMatrix[i].length; j++) {
					rotatedImageMatrix[j][imageMatrix.length - 1 - i] = imageMatrix[i][j];
				}
			}
			break;
		case COUNTERCLOCKWISE:
			for (int i = 0; i < imageMatrix.length; i++) {
				for (int j = 0; j < imageMatrix[i].length; j++) {
					rotatedImageMatrix[j][i] = imageMatrix[i][j];
				}
			}
			break;
		default:
			break;

		}

		return rotatedImageMatrix;
	}

	public static void printImageMatrix(int[][] imageMatrix) {
		for (int i = 0; i < imageMatrix.length; i++) {
			for (int j = 0; j < imageMatrix[i].length; j++) {
				System.out.print(imageMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
