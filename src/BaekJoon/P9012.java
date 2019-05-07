package BaekJoon;

import java.util.Scanner;

public class P9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int l=0;
			for(String j:s.next().split("")) {
				if(j.equals("(")) l++;
				if(j.equals(")")) l--;
				if(l<0) break;
			}
			if(l==0) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
