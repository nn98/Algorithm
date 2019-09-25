package BaekJoon;

import java.util.Scanner;

public class P12755 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),t=0;
		for(int i=0;t<n;i++) {
			t=(int) (t+(9*Math.pow(10, i))*(i+1));
		}
		System.out.println(t);
	}

}
