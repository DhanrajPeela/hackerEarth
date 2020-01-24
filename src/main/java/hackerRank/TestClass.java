package hackerRank;

import java.util.Scanner;

class TestClass {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iT = sc.nextInt();
		int iRes = 0;

		while (iT-- > 0) {
			int iA = sc.nextInt();
			int iB = sc.nextInt();

			if (((iB * iB) - (4 * iA * sc.nextInt())) >= 0) {
				iRes++;
			}
		}

		System.out.println(iRes);

		sc.close();
	}

}