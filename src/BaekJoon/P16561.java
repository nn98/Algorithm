package BaekJoon;

import java.util.Scanner;

public class P16561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()/3-2,count=0;
//		for(int i=3;i<=n-6;i+=3) {
//			for(int j=3;n-(i+j)!=0;j+=3) 
//				if((n-(i+j))%3==0) count++;
//		}
		for(int i=1;i<=n;i++) count+=i;
		System.out.println(count);
	}
}
