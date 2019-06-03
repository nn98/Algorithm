package BaekJoon;

import java.util.Scanner;
//1874
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),input=1,aIndex=0,bIndex=0;
		int[] arr=new int[n],brr=new int[n];
		boolean[] o=new boolean[n];
		boolean c=false;
		String r="+";
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			brr[i]=i+1;
		}
		for(;aIndex<n;) {
			System.out.println(aIndex+" "+bIndex);
			if(bIndex<0||bIndex>=n) {
				c=true;
				break;
			}
			if(arr[aIndex]==brr[bIndex]) {
//				System.out.println("-");
				r+="\n-";
				if(bIndex!=0) {
					o[bIndex]=true;
					bIndex--;
				}
				aIndex++;
			} else if(arr[aIndex]>brr[bIndex]) {
//				System.out.println("+");
				if(!o[bIndex])
					r+="\n+";
				bIndex++;
			} else if(arr[aIndex]<brr[bIndex]) {
//				System.out.println("-");
				if(!o[bIndex])
					r+="\n-";
				bIndex--;
			}
		}
		System.out.print(r);
		if(bIndex>0||c) System.out.println("NO");
		else System.out.print(r);
	}
}