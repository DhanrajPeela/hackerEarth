package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/match-makers

class MatchMakers {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iT = sc.nextInt();

		while (iT-- > 0) {
			int iTot = sc.nextInt();
			ArrayList<Integer> lstBoys = new ArrayList<Integer>();
			ArrayList<Integer> lstGirls = new ArrayList<Integer>();

			for (int i = 0; i < iTot; i++) {
				lstGirls.add(sc.nextInt());
			}

			for (int i = 0; i < iTot; i++) {
				lstBoys.add(sc.nextInt());
			}

			Collections.sort(lstGirls);
			Collections.sort(lstBoys, Collections.reverseOrder());

			int iRes = 0;
			for (int i = 0; i < iTot; i++) {
				if ((lstGirls.get(i) % lstBoys.get(i) == 0) || (lstBoys.get(i) % lstGirls.get(i) == 0)) {
					iRes++;
				}
			}

			System.out.println(iRes);
		}
		sc.close();
	}

}