package hackerRank;

import java.util.Scanner;

//Problem Link: https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/the-colorful-street-1

class TheColorfulStreet {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int iT = sc.nextInt();
		int iHouse = 0;
		int arr[][], color[][];

		while (iT-- > 0) {

			iHouse = sc.nextInt();
			arr = new int[iHouse][3];

			for (int i = 0; i < iHouse; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
				arr[i][2] = sc.nextInt();
			}

			color = new int[iHouse][3];
			color[0][0] = arr[0][0];
			color[0][1] = arr[0][1];
			color[0][2] = arr[0][2];

			for (int i = 1; i < iHouse; i++) {
				color[i][0] = Math.min(color[i - 1][1], color[i - 1][2]) + arr[i][0];
				color[i][1] = Math.min(color[i - 1][0], color[i - 1][2]) + arr[i][1];
				color[i][2] = Math.min(color[i - 1][1], color[i - 1][0]) + arr[i][2];
			}
			System.out.println(Math.min((Math.min(color[iHouse - 1][1], color[iHouse - 1][2])), color[iHouse - 1][0]));
		}
		sc.close();
	}

}