package BaekJoon;

import java.util.Scanner;

public class P17502 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,i=0;
		String[]a=s.next().split("");
		for(;i<n/2;i++) {
			if(a[i].equals("?"))
				if(a[n-2-i].equals("?"))
					a[i]=a[n-2-i]="a";
				else a[i]=a[n-2-i];
			else
				if(a[n-2-i].equals("?"))
					a[n-2-i]=a[i];
		}
		for(String j:a)System.out.print(j);
	}

}
