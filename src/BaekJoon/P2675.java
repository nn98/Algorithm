package BaekJoon;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int c=s.nextInt();
			String[] t=s.next().split("");
			for(int j=0;j<t.length;j++) 
				for(int k=0;k<c;k++) System.out.print(t[j]);
			System.out.println();
		}
	}

}
