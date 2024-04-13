package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		System.out.println(fib(arr,n));
	}

	private static int fib(int[] arr, int n) {
		if(n<2) {
			return n;
		}
		if(arr[n] == 0) {
			arr[n] = fib(arr,n-1)+fib(arr,n-2); //memoriztion
		}
		return arr[n];
	}

}
