package task2;

import java.util.Arrays;

public class Transformer {

	public String incrementEachDigit(int number) {
		int[] digits = splitToDigits(number);
		StringBuilder builder = new StringBuilder();
		Arrays.stream(digits).forEach(digit -> builder.append(++digit));
		return builder.toString();
	}

	private int[] splitToDigits(int number) {
		int[] digits = new int[getNumberOfDigits(number)];

		for (int i = 0; i < digits.length; i++) {
			digits[digits.length - 1 - i] = number % 10;
			number /= 10;
		}
		return digits;
	}

	private int getNumberOfDigits(int number) {
		return (int) Math.log10(number) + 1;
	}
}
