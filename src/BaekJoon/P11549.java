package BaekJoon;

import java.util.Scanner;

public class P11549 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(int i=0;i<5;i++) {
			if(s.nextInt()==n) sum++;
		}
		System.out.println(sum);
	}
}