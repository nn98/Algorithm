package BaekJoon;

import java.util.Scanner;

public class P1547_2 {

	static int a[]=new int[4];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		a[1]=1;
		a[2]=2;
		a[3]=3;
		for(;n>0;n--) {
			int i=s.nextInt(),j=s.nextInt(),t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(int i=0;i<4;i++)if(a[i]==1)System.out.print(i);
	}
}
