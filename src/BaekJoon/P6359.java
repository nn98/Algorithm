package BaekJoon;

import java.util.Scanner;

public class P6359 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),j,k,r;
		for(;i>0;i--) {
			j=s.nextInt();
			boolean[]c=new boolean[j];
			for(k=1;k<=j;k++) {
				for(int z=k-1;z<j;z+=k)
					if(c[z])c[z]=false;
					else c[z]=true;
			}
			r=0;
			for(k=0;k<j;k++)
				if(c[k])r++;
			System.out.println(r);
		}
	}
}
