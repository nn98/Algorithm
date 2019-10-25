package BaekJoon;

import java.util.Scanner;
public class P10539 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1,u=0,a=0;
		for(;i<=n;i++){
			u=s.nextInt()*i;
			System.out.print(u-a+" ");
			a+=u-a;
		}
	}
}