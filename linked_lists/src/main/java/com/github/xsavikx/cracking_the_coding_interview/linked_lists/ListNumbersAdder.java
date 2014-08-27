package com.github.xsavikx.cracking_the_coding_interview.linked_lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Class for Cracking the coding Interview task 2.5
 * 
 * Description of task(in <b>Russian</b>): Два числа хранятся в виде связных
 * списков, в которых каждый узел содержит один разряд. Все цифры хранятся в
 * обраном порядке, при этом первая цифра числа находится в начале списка.
 * напишите функцию, которая суммирует два числа и возвращает результат в виде
 * связного списка.<br/>
 * <i>Пример</i><br/>
 * Ввод: <code>(7->1->6) + (5->9->2)</code>. Это означает <code>617 + 295</code>
 * .<br/>
 * Вывод: <code>2->1->9</code>, что означает <code>912</code>.<br/>
 * <i>Дополнительно</i><br/>
 * Решите задачу, предпологая, что цифры записаны в прямом порядке.<br/>
 * Ввод: <code>(6->1->7) + (2->9->5)</code>. Это означает <code>617 + 295</code>
 * . Вывод: <code>9->1->2</code>, что означает <code>912</code>.
 * 
 * @author Iurii Sergiichuk
 *
 */
public class ListNumbersAdder {
	/**
	 * Adds two numbers in reversed format:<br/>
	 * <code>(7->1->6) + (5->9->2)
	 * == 617 + 295 </code><br/>
	 * And return result in the same reversed format
	 * 
	 * @param firstNumber
	 *            list of first number digits
	 * @param secondNumber
	 *            list of second number digits
	 * @return result list of digits
	 */
	public static List<Integer> addReversedListNumber(
			List<Integer> firstNumber, List<Integer> secondNumber) {
		if (firstNumber.isEmpty() && secondNumber.isEmpty())
			return new LinkedList<>();
		else if (firstNumber.isEmpty() && !secondNumber.isEmpty()) {
			return secondNumber;
		} else if (!firstNumber.isEmpty() && secondNumber.isEmpty()) {
			return firstNumber;
		}
		int number1 = 0;
		int number2 = 0;
		int multiplier = 1;
		for (Integer elem : firstNumber) {
			number1 += elem * multiplier;
			multiplier *= 10;
		}
		multiplier = 1;
		for (Integer elem : secondNumber) {
			number2 += elem * multiplier;
			multiplier *= 10;
		}

		int resultNumber = number1 + number2;
		multiplier = 10;
		List<Integer> result = new LinkedList<Integer>();
		while (resultNumber != 0) {
			int digit = resultNumber % multiplier;
			result.add(digit);
			resultNumber /= multiplier;
		}
		return result;
	}

	public static List<Integer> addListNumber(List<Integer> firstNumber,
			List<Integer> secondNumber) {
		if (firstNumber.isEmpty() && secondNumber.isEmpty())
			return new LinkedList<>();
		else if (firstNumber.isEmpty() && !secondNumber.isEmpty()) {
			return secondNumber;
		} else if (!firstNumber.isEmpty() && secondNumber.isEmpty()) {
			return firstNumber;
		}
		int multiplier = firstNumber.size() - 1;
		int firstNum = 0;
		for (Integer elem : firstNumber) {
			firstNum += elem * Math.pow(10, multiplier--);
		}
		multiplier = secondNumber.size() - 1;
		int secondNum = 0;
		for (Integer elem : secondNumber) {
			secondNum += elem * Math.pow(10, multiplier--);
		}
		int resultNum = secondNum + firstNum;
		int resultCopy = resultNum;
		multiplier = 0;
		while (resultNum != 0) {
			resultNum /= 10;
			multiplier++;
		}

		List<Integer> result = new LinkedList<Integer>();
		while (multiplier != 0) {
			int digit = (int) (resultCopy / Math.pow(10, --multiplier));
			result.add(digit);
			resultCopy %= Math.pow(10, multiplier);
		}
		return result;
	}
}
