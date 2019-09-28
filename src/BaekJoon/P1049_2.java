package BaekJoon;

import java.util.Scanner;

public class P1049_2 {
	//어떤 미친새끼가 기타줄을 100개를사 이 또라이같은 ㅅ
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=9000;
		for(int m=s.nextInt();m>0;m--) {
			int t=s.nextInt();
			r=r<t?r:t;
			t=s.nextInt()*n;
			r=r<t?r:t;
		}
		System.out.print(r);
	}

}
