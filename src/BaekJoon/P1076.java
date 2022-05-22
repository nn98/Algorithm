package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] arr=new String[3],t="black,brown,red,orange,yellow,green,blue,violet,grey,white".split(",");
		int[] m= {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		long r;
		for(int i=0;i<3;i++) arr[i]=s.next();
		int[] set=new int[3];
		for(int i=0;i<3;i++) for(int j=0;j<10;j++) if(arr[i].equals(t[j])) set[i]=j;
		r=set[0]*10+set[1];
		//System.out.println(Arrays.toString(arr)); +" , "+R
		//r=Integer.parseInt(R);
		System.out.println(Arrays.toString(set));
		System.out.println(r*m[set[2]]);
	}

}
/*
 import java.util.Scanner;

public class P1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] arr=new String[3],t="black,brown,red,orange,yellow,green,blue,violet,grey,white".split(",");
		String r="";
		for(int i=0;i<3;i++) {
			arr[i]=s.next();
			for(int k=0;k<t.length;k++) {
				if(arr[i].equals(t[k])) {
					if(i==2) {
						for(int x=0;x<k;x++) r+="0";
					}
					else r+=k;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(r);
	}

}

 */