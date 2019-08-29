package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1911_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=s.nextInt(),arr[]=new int[n*2],re=0,in=0,sum=0;
		for(int i=0;i<n*2;i+=2) {
			arr[i]=s.nextInt();
			arr[i+1]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n*2;i+=2) {
//			System.out.println(re+" "+in+" "+arr[i]);
			int a=arr[i+1]-arr[i],add=a/l;
			if(re>0) {
				if(arr[i]<=in+re) {
					if(re>=a) {
						re-=a;
//						System.out.println(re);
						continue;
					}
					else arr[i]=arr[i]+re;
				}
//				System.out.println(arr[i]);
			}
			if(a%l>0) add++;
			re=add*l-a;
			in=arr[i+1];
			sum+=add;
//			System.out.println(re+" "+in);
		}
		//		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		//		r=sum/l;
		//		if(sum%l>0) r++;
		//		System.out.println(r);
	}
}