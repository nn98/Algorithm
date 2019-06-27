package BaekJoon;

import java.util.Scanner;

public class P1874_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),input=1,aIndex=0,bIndex=0;
		int[] arr=new int[n],brr=new int[n];
		boolean[] o=new boolean[n];
		String r="+\n";
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			brr[i]=i+1;
		}
		for(;aIndex<n;) {
//			System.out.println(aIndex + " , " + bIndex+"\n"+r);
			if(arr[aIndex]==brr[bIndex]) {
				r+="-\n";
				o[bIndex]=true;
				bIndex--;
				aIndex++;
			} else if(arr[aIndex]>brr[bIndex]) {
				if(!o[bIndex])
					r+="+\n";
				bIndex++;
			} else if(arr[aIndex]<brr[bIndex]) {
				if(!o[bIndex])
					r+="-\n";
				bIndex--;
			}
		}
		if(bIndex>0) System.out.println("NO");
		else System.out.print(r);
	}
}