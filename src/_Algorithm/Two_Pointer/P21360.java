package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P21360 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0;
		char[]a=s.next().toCharArray();
		for(;j<n;i=j++)if(a[j]=='.')break;
		System.out.println(i+" "+j);
	}

}
