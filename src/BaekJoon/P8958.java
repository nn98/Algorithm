package BaekJoon;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			String[] test=s.next().split("");
			int r=0,c=0;
			for(int j=0;j<test.length;j++) {
				if(test[j].compareTo("O")==0) {
					r++;
					if(c>0) r+=c;
					c++;
				}
				else c=0;
			}
			
			System.out.println(r);
			
		}
	}

}
