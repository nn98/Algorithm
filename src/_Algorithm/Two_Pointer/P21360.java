package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P21360 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0;
		char[]a=s.next().toCharArray();
		for(;i<n;i++)if(a[i]=='.')break;
		j=i+1;
		System.out.println(i+" "+j);
	}

}
