import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 첫 번째 줄: n 입력 받기
		int n = Integer.parseInt(br.readLine());

		// 배열 선언
		int[] arr = new int[n];

		// 두 번째 줄부터 n개의 숫자를 입력 받기
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append('\n');
		}
		// Arrays.sort()를 사용하여 오름차순 정렬

		// 정렬된 배열 출력
		System.out.println(sb);


	}
}