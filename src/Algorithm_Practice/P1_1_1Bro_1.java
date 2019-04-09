package Algorithm_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P1_1_1Bro_1 {

	static int[] solution(int p) {
		int[] money = {50000,10000,5000,1000,500,100,50,10,1};
		int[] r=new int[money.length];
		for(int i=0;i<r.length;i++) {
			r[i]=p/money[i];
			p%=money[i];
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		System.out.println(Arrays.toString(solution(p)));
	}

}