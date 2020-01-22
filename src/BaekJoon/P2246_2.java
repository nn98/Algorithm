package BaekJoon;

import java.util.Scanner;

public class P2246_2 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[]=new int[n],r=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(i);
			boolean c=true,d=true;
			for(int j=0;j<n&&(c||d);j++) {
				if(i!=j) {
					if(a[i]==a[j]||b[i]==b[j])continue;
					System.out.printf("%d < %d , ",a[j],a[i]);
					if(a[j]<a[i])c=b[j]>b[i];
					System.out.printf("%d < %d = ",b[j],b[i]);
					if(b[j]<b[i])d=a[j]>a[i];
					System.out.println(c+" "+d);
				}
			}
			if(c||d) {
				r++;
			}
		}
		System.out.println(r);
	}
}