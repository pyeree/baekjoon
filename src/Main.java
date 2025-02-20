import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;
	static int[][] arr;
	static int count = 0;

	static int node, line;


	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		node = Integer.parseInt(in.readLine());
		line = Integer.parseInt(in.readLine());

		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		for (int i = 0; i < line; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;
		}

		dfs(1);
		System.out.println(count-1);

	}

	public static void dfs(int start) {
		check[start] = true;
		count++;
		for (int i = 0; i <= node; i++) {
			if (arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}
}
