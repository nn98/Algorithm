package BaekJoon;

import java.util.Scanner;

public class P1919_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(""),b=s.next().split("");
		int i=0,j,r=0;
		for(;i<a.length;i++)
			for(j=0;j<b.length;j++)
				if(a[i].equals(b[j])&&!a[i].equals("")) {
					r++;
					a[i]=b[j]="";
				}
		System.out.print(r);
	}
}