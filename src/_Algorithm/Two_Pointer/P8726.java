package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P8726 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,c=1,v=0,r=n;
		s.nextLine();
		String[]a=s.nextLine().split(" ");
		for(;i<n-1;) {
			if(a[i].equals("0")) {
				System.out.println("go: "+i);
				j=i+1;
				while(c<=m&j<n) {
					if(a[j].equals("1")) {
						v++;
					}else {
						c++;
					}
					j++;
				}
				System.out.println(c+" "+v);
				if(c==m)r=r<v?r:v;
			}
			for(;++i<n-1&a[i].equals("1");v--)if(i==n-1)break;
			c--;
		}
		System.out.println(r==n?"NO":r);
	}

}
