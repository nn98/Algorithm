package BaekJoon;

import java.util.Scanner;

public class P13225 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v,c,j;
		for(;n-->0;) {
			v=s.nextInt();
			c=0;
			for(j=1;j<v/2;j++)if(v%j==0)c+=2;
			if(Math.sqrt(v)%1==0)c++;
			System.out.println(v+" "+c);
		}
		
	}

}
