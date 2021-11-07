package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P15565_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],i=0,j=0;
		for(;i++<n;)if(s.nextInt()<2)a[j++]=i;
		System.out.println(Arrays.toString(a));
	}

}
