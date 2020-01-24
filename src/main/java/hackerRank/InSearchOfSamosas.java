package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/problem/algorithm/in-search-of-samosa-1

class InSearchOfSamosas {
	public static void main(String args[]) throws Exception {

		Scanner objSc = new Scanner(System.in);

		String sIn[] = objSc.nextLine().split(" ");

		int iN = Integer.parseInt(sIn[0]);
		int iK = Integer.parseInt(sIn[1]);

		String sIn1[] = objSc.nextLine().split(" ");

		ArrayList<Integer> lstSam = new ArrayList<Integer>();

		for (int iCntr = 0; iCntr < iN; iCntr++) {
			lstSam.add(Integer.parseInt(sIn1[iCntr]));
		}

		Collections.sort(lstSam);

		int iMoney = 0, iC = 0;

		for (int iCntr = 0; iCntr < iN; iCntr++) {
			if (iMoney + lstSam.get(iCntr) <= iK) {
				iMoney += lstSam.get(iCntr);
				iC++;
			}
		}

		System.out.println(iC);

		objSc.close();
	}
}
