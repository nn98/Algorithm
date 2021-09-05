package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P2811_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=0,I=0,k,J=0,V=0,b[]=new int[n],r=0;
		for(;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]<0) {
				I=j==0?i:I;
				j++;
				if(j>=V) {
					J=I;
					V=j;
				}
			}else {
				for(j*=2;--I>=0&j-->0;b[I]++);
				I=j=0;
//				System.out.println(Arrays.toString(b));
			}
			//			System.out.println(k);
			a[i]=-j;
//			System.out.println("I: "+I+" j: "+j);
		}
//		System.out.println(Arrays.toString(a));
		if(j>0)for(j*=2;--I>=0&j-->0;b[I]++);
//		if(V>0)for(V*=3;--J>=0&V-->0;b[J]++);
//		System.out.println(V);
		for(i=0;i<n;i++) {
			if(a[i]==-V) {
				System.out.println("\t"+i);
				I=0;
				k=V*3;
				for(j=i-1;j>=0&k-->0;System.out.print(j),I+=b[j--]>0?0:1);
				r=I>r?I:r;
			}
		}
//		System.out.println(r);
		//			if(I-j*2<0)k+=I;
		//			else k+=j*2;

		//		i=J-V*2;
		//		if(i>=0) {
		//			if(i-V<0)k+=i;
		//			else k+=V;
		//		}
		//		System.out.println("V: "+V+" J: "+J+" k: "+k);
		for(i=0;i<n;r+=b[i++]>0?1:0);
//		System.out.println(Arrays.toString(b));
		System.out.println(r);
	}

}
