package BaekJoon;

import java.util.Scanner;

public class P10818 {
	public static void main(String[]a){
		Scanner s=new Scanner(System.in);
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int n=s.nextInt();n>0;n--) {
			int t=s.nextInt();
			min=min<t?min:t;
			max=max>t?max:t;
		}
		System.out.print(min+" "+max);
	}
}
