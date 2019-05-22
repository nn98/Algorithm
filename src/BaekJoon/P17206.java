package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P17206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int[] arr= {3,6,7,9,12,14,15,18,21};
		for(int i=0;i<T;i++) {
			int n=s.nextInt(),r=0,c=n/21,e=n%21;
//			if(e==0) for(int j=0;j<arr.length;j++) arr[j]+=21*(c-1);
//			else for(int j=0;j<arr.length;j++) arr[j]+=21*c;
			if(c>1) for(int j=0;j<arr.length;j++) arr[j]+=21*(c-1);
			for(int j=0;j<arr.length;j++) if(n>=arr[j]-21*c)r+=arr[j];
			System.out.println(Arrays.toString(arr)+r);
		}
	}

}
