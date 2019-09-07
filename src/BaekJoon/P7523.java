package BaekJoon;

import java.util.Scanner;

public class P7523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			//정수 - 음수/양수 케이스 구분
			long a=s.nextLong(),b=s.nextLong(),r=0;
			if(a<0&b<0) 
				r=a*(Math.abs(a)+1)/2-b*(Math.abs(b)-1)/2;
			else if (a<0) 
				r=b*(Math.abs(b)+1)/2+a*(Math.abs(a)+1)/2;
			else 
				r=b*(b+1)/2-a*(a-1)/2;
			System.out.println("Scenario #"+(i+1)+":");
			System.out.println(r+"\n");
		}
	}
}
