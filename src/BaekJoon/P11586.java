package BaekJoon;

import java.util.Scanner;

public class P11586 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,m;
		StringBuilder[]a=new StringBuilder[n];
		for(;i<n;i++)a[i]=new StringBuilder(s.next());
		switch(s.nextInt()) {
		case 1:
			for(i=0;i<n;i++)
				System.out.println(a[i]);
			break;
		case 2:
			for(i=0;i<n;i++)
				System.out.println(a[i].reverse());
			break;
		case 3:
			while(--i>=0)
				System.out.println(a[i]);
			break;
		}
	}
}