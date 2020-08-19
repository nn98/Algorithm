package _Algorithm.String;

import java.util.Scanner;

public class P9933_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=n,j,l,r,k;
		s.nextLine();
		StringBuffer a[]=new StringBuffer[n],b;
		while(i-->0)a[i]=new StringBuffer(s.nextLine());
		for(i=0;i<n;i++) {
			l=a[i].length()-1;
			for(j=0;j<=i;j++) 
				if(a[i].length()==a[j].length())
					if(a[i].charAt(l)==a[j].charAt(0)) {
						r=0;
						for(k=0;k<l/2&&r==0;k++)
							if(a[i].charAt(k)!=a[j].charAt(l-k))
								r++;
						if(r==0)
							System.out.print(l+1+" "+a[i].charAt(l/2));
					}
		}
	}
}