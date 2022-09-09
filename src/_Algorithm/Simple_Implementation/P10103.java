package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P10103 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,i=0,c=0,d=0;
		for(;i<n;i++,a=s.nextInt(),b=s.nextInt(),c+=a<b?b:0,d+=b<a?a:0);
		System.out.print(100-c+"\n"+(100-d));
	}

}
