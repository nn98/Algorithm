package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P10025 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),v=1000000,i=0,l=m*2+1,j,a[]=new int[v],
				r=0,u=0;
		for(;n-->0;j=s.nextInt(),a[s.nextInt()]=j);
		for(j=0;j<l;u+=a[j++]);
		j--;
		for(;j<v-1;) {
			System.out.printf("%d - %d : %d",i,j,u);
			r=r>u?r:u;
			u-=a[i++];
			u+=a[++j];
		}
		System.out.println(r);
	}

}
