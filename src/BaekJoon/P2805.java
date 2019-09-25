package BaekJoon;

import java.util.Scanner;

public class P2805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),arr[]=new int[n],v,max=0,min=0,mid=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			max=max>arr[i]?max:arr[i];
		}
		boolean f=true;
		mid=(min+max)/2;
		while(true) {
			if((mid==min)||(mid==max)) break;
//			System.out.println(min+" "+mid+" "+max);
			int sum=0;
			for(int i=0;i<n;i++) sum+=arr[i]-mid>0?arr[i]-mid:0;
//			System.out.println(sum);
			if(sum==m) break;
			if(sum>m) min=mid;
			else if(sum<m) max=mid;
			mid=(min+max)/2;
		}
		System.out.println(mid);
	}
}
