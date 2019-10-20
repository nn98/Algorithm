package BaekJoon;

import java.util.Scanner;

public class P11586_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,m;
		String[]a=new String[n];
		for(;i<n;i++)a[i]=s.next();
		m=s.nextInt();
		if(m==1)
			for(String k:a)
				System.out.println(k);
		if(m==2)
			for(String k:a)
				System.out.println(new StringBuffer(k).reverse());
		if(m==3)
			while(--i>=0)
				System.out.println(a[i]);
	}
}