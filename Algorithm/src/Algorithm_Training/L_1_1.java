package Algorithm_Training;

import java.util.Arrays;
import java.util.Scanner;

public class L_1_1 {

	public static int[] solution(int m) {
		int[] r=new int[9];
		r[0]=m/50000;
		m%=50000;
		r[1]=m/10000;
		m%=10000;
		r[2]=m/5000;
		m%=5000;
		r[3]=m/1000;
		m%=1000;
		r[4]=m/500;
		m%=500;
		r[5]=m/100;
		m%=100;
		r[6]=m/50;
		m%=50;
		r[7]=m/10;
		m%=10;
		r[8]=m/1;
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.println(Arrays.toString(solution(m)));
	}
}
/*
public class Exam01 {
		static final int[] ±Ý¾× = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		public static int[] solution(int money) {
			int[] °¹¼ö = new int[9];
			for (int i = 0; i < ±Ý¾×.length; ++i) {
				°¹¼ö[i] = money / ±Ý¾×[i];
				money = money % ±Ý¾×[i];
			}
			return °¹¼ö;
		}
		public static void main(String[] args) {
			int[] a = { 50237, 15000 };
			for (int money : a)
				System.out.println(Arrays.toString(solution(money)));
		}
*/