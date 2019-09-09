package BaekJoon;

import java.util.Scanner;

public class P9713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			int f=s.nextInt();
			for(int j=1;j<=f;j++) {
				if(j%2==1) sum+=j;
			}
			System.out.println(sum);
		}
	}
}
