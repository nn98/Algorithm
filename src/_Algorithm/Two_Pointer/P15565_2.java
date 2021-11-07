package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P15565_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt()-1,a[]=new int[n],i=0,j=0,r=1000001,c;
		for(;i++<n;)if(s.nextInt()<2)a[j++]=i;
		for(;j-->3;) {
			c=a[j]-a[j-k]+1;
			r=r<c?r:c;
		}
		System.out.println(r==1000001?-1:r);
	}

}
