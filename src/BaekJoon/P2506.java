package BaekJoon;

import java.util.Scanner;

public class P2506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),add=1,sum=0;
		for(int i=0;i<n;i++) {
			if(s.nextInt()==1) sum+=add++;
			else add=1;
		}
		System.out.println(sum);
	}
}
