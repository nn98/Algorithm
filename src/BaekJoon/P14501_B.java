package BaekJoon;

//½Å±â
import java.util.Arrays;
import java.util.Scanner;

public class P14501_B {
	static int[] d = new int[21];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int t = sc.nextInt();
			int p = sc.nextInt();
			d[i]=Math.max(d[i-1], d[i]);
			d[i+t-1] = Math.max(d[i+t-1], d[i-1]+p);
			System.out.println(Arrays.toString(d));
		}
		System.out.print(d[n]);
	}
}
