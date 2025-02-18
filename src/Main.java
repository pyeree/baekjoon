import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer sb = new StringTokenizer(in.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(sb.nextToken());
			}
		}

		System.out.println("null");
		Arrays.sort(arr, (a, b) -> {
			if (a[0] == b[0])
				return a[1] - b[1];
			return a[0] - b[0];
		});

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		in.close();
	}

}
