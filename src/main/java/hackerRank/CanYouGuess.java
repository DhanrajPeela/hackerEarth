package hackerRank;

import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/can-you-guess

class CanYouGuess {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int iT = Integer.valueOf(sc.nextLine());

		for (int i = 0; i < iT; i++) {
			int iNum = Integer.valueOf(sc.nextLine());
			System.out.println(getSum(iNum));
		}

		sc.close();
	}

	public static int getSum(int iNum) {
		int iSum = 1;

		if (iNum == 1) {
			return 0;
		}

		for (int j = 2; j < iNum; j++) {
			if (iNum % j == 0) {
				iSum += j;
			}
		}
		return iSum;
	}

}