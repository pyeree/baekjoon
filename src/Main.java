import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 최대 공약수 유클리드 호제법
		// a*b = 최대공약수 * 최소공배수
		int GCD = gcd(a, b);
		int lcm = (a * b) / GCD;
		System.out.println(GCD);
		System.out.println(lcm);

	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
			gcd(a, b);
		}
		return a;
	}
}