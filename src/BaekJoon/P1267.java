package BaekJoon;

import java.util.Scanner;

public class P1267 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],y[]=new int[n],m[]=new int[n],Y=0,M=0;
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]>=30)Y+=(a[i]/30+(a[i]%30>0?1:0))*10;
			if(a[i]>=60)M+=(a[i]/60+(a[i]%60>0?1:0))*15;
			System.out.println(Y+" "+M);
		}
		if(Y==M)
			System.out.print("Y M "+Y);
		else if(Y<M)
			System.out.print("Y "+Y);
		else
			System.out.print("M "+M);
	}

}
