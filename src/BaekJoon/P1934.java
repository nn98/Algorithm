package BaekJoon;

import java.util.Scanner;

public class P1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int a=s.nextInt(),b=s.nextInt(),k=2,j,min=a<b?a:b;
			for(j=min;!(j%a==0&&j%b==0);k++) {
				j=min*k;
			}
			System.out.println(j);
		}
	}

}
