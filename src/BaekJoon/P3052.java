package BaekJoon;

import java.util.Scanner;

public class P3052 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int i=0,a[]=new int[42],r=0;
		for(;i<10;i++)a[s.nextInt()%42]++;
		for(int j:a)if(j!=0)r++;
		System.out.print(r);
	}
}