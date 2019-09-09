package BaekJoon;

import java.util.Scanner;

public class P10886_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=0,b=0;
		for(int i=0;i<n;i++) {
			int j=s.nextInt();
			if(j==1) a++;
			else if(j==0) b++;
		}
		if(a>b) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
	}
}
