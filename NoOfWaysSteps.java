package dynamicProgramming;

import java.util.Scanner;

public class NoOfWaysSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		System.out.println(totalWays(arr,n));

	}

	private static int totalWays(int[] arr, int n) {
		if(n==0 || n==1) return 1;
		if(n == 2) return 2;
		
		if(arr[n] == 0) {
			for(int i=1;i<=3;i++) {  //3 indiactes highest possible jump [1,2,3]
				arr[n] += totalWays(arr, n-i);
			}
			/*
			 * arr[n] = totalWays(arr, n-1) + totalWays(arr, n-2) + totalWays(arr, n-3);
			 */
			}
		return arr[n];
	}

}
