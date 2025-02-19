import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;

	public static int recru(int n) {

		if (dp[n] == null) {
			if (n % 6 == 0) {
				dp[n] = Math.min(recru(n - 1), Math.min(recru(n / 2), recru(n / 3))) + 1;
			} else if (n % 3 == 0) {
				dp[n] = Math.min(recru(n / 3), recru(n - 1)) + 1;
			} else if (n % 2 == 0) {
				dp[n] = Math.min(recru(n / 2), recru(n - 1)) + 1;
			} else {
				dp[n] = recru(n - 1) + 1;
			}
		}

		return dp[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		dp = new Integer[n + 1];
		dp[0] = dp[1] = 0;

		System.out.println(recru(n));

	}
}
