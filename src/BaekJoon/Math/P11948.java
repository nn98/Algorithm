package BaekJoon.Math;
import java.util.Scanner;
public class P11948 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=100,u=0,n,i=0;
		for(;i++<6;) {
			u+=n=s.nextInt();
			m=m<n?m:n;
			if(i==4|i==6) {
				u-=m;
				m=100;
			}
		}
		System.out.println(u);
	}
}