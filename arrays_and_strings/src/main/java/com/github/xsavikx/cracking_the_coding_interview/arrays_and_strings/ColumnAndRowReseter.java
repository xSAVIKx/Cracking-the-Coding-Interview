package com.github.xsavikx.cracking_the_coding_interview.arrays_and_strings;

import java.util.Arrays;

/**
 * Class for Cracking the coding Interview task 1.7
 * 
 * Description of task(in <b>Russian</b>): Напишите алгоритм, реализующий
 * следующее условие: если элемент матрицы в точке <code>M x N</code> равен
 * <code>0</code>, то есть столбец и вся строка обнуляются.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class ColumnAndRowReseter {
	private static final int ZERO = 0;

	/**
	 * Sets column and row for given index to Zero
	 * 
	 * @param matrix
	 *            matrix to set
	 * @param mPosition
	 *            M position in matrix
	 * @param nPosition
	 *            N position in matrix
	 * @return new matrix with column N and row M values set to Zero
	 * 
	 * @throws IllegalArgumentException
	 *             if matrix is null, or if any index bound exceptions happened
	 */
	public static int[][] setColumnAndRowToZero(int[][] matrix, int mPosition,
			int nPosition) {
		if (matrix == null) {
			throw new IllegalArgumentException("matrix cannot be null");
		}
		if (mPosition < 0 || nPosition < 0 || mPosition > matrix.length
				|| nPosition > matrix[mPosition].length) {
			throw new IllegalArgumentException("Cannot find element at M="
					+ mPosition + ", N=" + nPosition);
		}
		int[][] zeroedMatrix = new int[matrix.length][];
		for (int i = 0; i < zeroedMatrix.length; i++) {
			zeroedMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ZERO) {
					for (int k = 0; k < zeroedMatrix.length; k++) {
						zeroedMatrix[k][j] = ZERO;
					}
					Arrays.fill(zeroedMatrix[i], ZERO);
				}
			}
		}
		return zeroedMatrix;
	}
}
