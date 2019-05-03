package BaekJoon;

import java.util.Scanner;

public class P2581 {

	static int sol(int n) {
		if(n==1) return 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),sum=0,min=-1;
		for(int i=m;i>=n;i--) {
			if(sol(i)==1) {
				sum+=i;
				min=i;
			}
			
		}
		if(min==-1) System.out.println(min);
		else System.out.println(sum+"\n"+min);
	}

}
