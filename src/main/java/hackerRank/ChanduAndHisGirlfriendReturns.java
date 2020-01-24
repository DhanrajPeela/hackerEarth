package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/chandu-and-his-girlfriend-returns

class ChanduAndHisGirlfriendReturns {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iT = sc.nextInt();

		while (iT-- > 0) {

			int iN = sc.nextInt();
			int iM = sc.nextInt();
			sc.nextLine();

			int[] lst = new int[iN + iM];
			String[] input = sc.nextLine().split(" ");

			for (int i = 0; i < iN; i++) {
				lst[i] = Integer.parseInt(input[i]);
			}

			String[] input1 = sc.nextLine().split(" ");
			for (int i = 0; i < iN; i++) {
				lst[i + iN] = Integer.parseInt(input1[i]);
			}

			Arrays.sort(lst);

			for (int i = lst.length - 1; i >= 0; i--) {
				System.out.print(lst[i] + " ");
			}

			System.out.println();
		}
		sc.close();
	}

}