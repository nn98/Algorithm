package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1138 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[]=new int[n],i=0,j;
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		for(i=0;i<n;i++) {
			j=0;
			while(a[i]!=0){
				if(b[j]==0)
					a[i]--;
				j++;
			}
			while(b[j]!=0)j++;
			b[j]=i+1;
		}
		for(int t:b)System.out.print(t+" ");
	}
}
