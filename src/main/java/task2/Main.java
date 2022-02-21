package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Transformer trans = new Transformer();
		System.out.println("Insert number");
		int num = scanner.nextInt();
		
		System.out.println("Result: " + trans.incrementEachDigit(num));
		
		scanner.close();
	}
}
