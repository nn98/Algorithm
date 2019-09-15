package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2448_C {
	
	static String[][] arr;
	
	static void sol(int h,int x,int y) {
		if(h==3) {
			System.out.println(x+" "+y);
			arr[y][x]="*";
			arr[y+1][x-1]="*";
			arr[y+1][x+1]="*";
			arr[y+2][x-2]="*";
			arr[y+2][x-1]="*";
			arr[y+2][x]="*";
			arr[y+2][x+1]="*";
			arr[y+2][x+2]="*";
			return;
		}
		sol(h/2,x,y);
		sol(h/2,x-(h/2),y+(h/2));
		sol(h/2,x+(h/2),y+(h/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),add=-1;
		arr=new String[n][n];
		System.out.println(arr.length);
		for(int i=0;i<n;i++) {
//			arr[i]=new String[add+=2];
			Arrays.fill(arr[i]," ");
		}
		sol(n,n-1,0);
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) System.out.print(" ");
			for(String j:arr[i-1]) System.out.print(j);
			System.out.println();
		}
	}

}
