package BaekJoon;

import java.util.Scanner;

public class P1874_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),input=1,aIndex=0,bIndex=0;
		int[] arr=new int[n],brr=new int[n];
		String r="";
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for(;aIndex<n;) {
			System.out.println(aIndex+" , "+bIndex);
			if(input==1) {
				brr[bIndex]=input++;
				bIndex++;
				System.out.println("+");
				r+="+\n";
			} else brr[bIndex]=input++;
			if(arr[aIndex]==brr[bIndex]) {
				bIndex--;
				aIndex++;
				System.out.println("-");
				r+="-\n";
			} else if(arr[aIndex]>brr[bIndex]) {
				brr[bIndex]=input++;
				bIndex++;
				System.out.println("+");
				r+="+\n";
			} else if(arr[aIndex]<brr[bIndex]) {
				bIndex--;
				aIndex++;
				System.out.println("-");
				r+="-\n";
			}
		}
		if(bIndex!=0) System.out.println("NO");
		else System.out.println(r);
	}

}
