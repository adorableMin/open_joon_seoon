package test;

import java.util.Scanner;

public class Algorithm_prac_no16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i < N + 1; i++)
			dp[i] = ((dp[i - 2] * 2) + dp[i - 1]) % 796796;

		System.out.println("result = " + dp[N]);
	}

}