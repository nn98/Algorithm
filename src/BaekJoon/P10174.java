package BaekJoon;

import java.util.Scanner;

public class P10174 {

	static boolean sol(String[] in) {
		for(int i=0;i<in.length/2;i++) {
			if(in[i].equals(in[in.length-(i+1)])) continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String[] arr=s.nextLine().toLowerCase().split("");
			if(sol(arr)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
