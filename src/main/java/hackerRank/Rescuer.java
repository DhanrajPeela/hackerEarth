package hackerRank;

import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/problem/algorithm/rescuer-1/

class Rescuer {

	public static void main(String[] args) {

		Scanner objSc = new Scanner(System.in);

		int iT = Integer.parseInt(objSc.nextLine());

		for (int iCounter = 0; iCounter < iT; iCounter++) {

			String[] arrInput = objSc.nextLine().split(" ");

			int x1 = Integer.valueOf(arrInput[0]);
			int y1 = Integer.valueOf(arrInput[1]);
			int x2 = Integer.valueOf(arrInput[2]);
			int y2 = Integer.valueOf(arrInput[3]);
			int v1 = Integer.valueOf(arrInput[4]);
			int v2 = Integer.valueOf(arrInput[5]);
			double fTime = 0.00000;

			if (x1 == x2) {

				fTime = (double) Math.abs(y1) / v1;

			} else {

				double L2S = Math.sqrt(((x1 - x2) * (x1 - x2)) + y1);
				fTime = L2S / v1;
			}

			fTime = fTime + (Math.abs(y2) / v2);

			System.out.printf("%.5f%n", fTime);
		}
		objSc.close();
	}
}