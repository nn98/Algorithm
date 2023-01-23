package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P1547 {

	static void sol(int i,int j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static int a[]=new int[4];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		a[1]=1;
		a[2]=2;
		a[3]=3;
//		System.out.println(Arrays.toString(a));
		for(;n>0;n--) {
			sol(s.nextInt(),s.nextInt());
		}
		for(int i=0;i<4;i++)if(a[i]==1)System.out.print(i);
	}

}