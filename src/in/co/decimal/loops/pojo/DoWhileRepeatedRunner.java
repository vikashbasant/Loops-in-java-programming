package in.co.decimal.loops.pojo;

import java.util.Scanner;

public class DoWhileRepeatedRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		DoWhileRepeat doWhileRepeat = new DoWhileRepeat(number);
		doWhileRepeat.printCuble();

	}

}
