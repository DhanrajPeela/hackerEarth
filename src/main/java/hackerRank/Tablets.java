package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Problem Link:  https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/tablets

public class Tablets {

	public static void main(String[] args) throws Exception {

		BufferedReader objBR = new BufferedReader(new InputStreamReader(System.in));

		int iNoPat = Integer.parseInt(objBR.readLine());
		int arrIPatRat[] = new int[iNoPat];

		for (int iCntr = 0; iCntr < iNoPat; iCntr++) {
			arrIPatRat[iCntr] = Integer.parseInt(objBR.readLine());
		}

		int[] arrIMed = new int[iNoPat];
		arrIMed[0] = 1;

		for (int iCntr = 1; iCntr < iNoPat; iCntr++) {
			if (arrIPatRat[iCntr] > arrIPatRat[iCntr - 1])
				arrIMed[iCntr] = arrIMed[iCntr - 1] + 1;
			else {
				arrIMed[iCntr] = 1;
			}
		}

		for (int iCntr = iNoPat - 2; iCntr >= 0; iCntr--) {
			if (arrIPatRat[iCntr] > arrIPatRat[iCntr + 1] && arrIMed[iCntr] <= arrIMed[iCntr + 1]) {
				arrIMed[iCntr] = arrIMed[iCntr + 1] + 1;
			}
		}

		int iMinTabs = 0;

		for (int iCntr = 0; iCntr < iNoPat; iCntr++) {
			iMinTabs += arrIMed[iCntr];
			System.out.print(arrIMed[iCntr] + ", ");
		}
		System.out.println();
		System.out.println(iMinTabs);

	}
}
