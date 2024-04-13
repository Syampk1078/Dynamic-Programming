package dynamicProgramming;

import java.util.Scanner;

public class MinStepsStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		System.out.println(minSteps(arr,n));

	}

	private static int minSteps(int[] arr, int n) {
		if(n==0) return 0;
		if(n==1 || n==2 || n==3) return 1;
		
		if(arr[n] == 0) {
			/*
			 * for(int i=1;i<=3;i++) { //3 indiactes highest possible jump [1,2,3] arr[n] +=
			 * totalWays(arr, n-i); }
			 */
			
			  arr[n] = 1 + Math.min(Math.min(minSteps(arr, n-1) , minSteps(arr, n-2)),
					  minSteps(arr, n-3));
			 
			}
		return arr[n];
	}

}
