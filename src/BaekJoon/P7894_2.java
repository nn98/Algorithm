package BaekJoon;

import java.util.Scanner;

public class P7894_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- > 0) {
            int m = sc.nextInt();
            double ans = 0;
            for(int i = 0; i < m; i++) {
                ans += Math.log10(i + 1);
            }
            System.out.println((int) (ans + 1));
        }
	}
}
