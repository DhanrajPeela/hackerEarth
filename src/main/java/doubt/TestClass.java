package doubt;

import java.util.Scanner;

class TestClass {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int iT = sc.nextInt();
		while (iT-- > 0) {
			System.out.print("Int: " + sc.nextInt());
			System.out.print("Int: " + sc.nextInt());
			System.out.print("Int: " + sc.nextInt());
			System.out.print("Line " + sc.nextLine());
		}
		System.out.println("End");
		sc.close();
	}
}