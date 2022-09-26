package _Algorithm.Simple_Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class P2991 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),p=s.nextInt(),
				m=s.nextInt(),n=s.nextInt(),i=0,j=0,l=1000,x[]=new int[l],k;
		for(;i<l|j<l;) {
			for(k=i;k<a&k<l;x[k++]++);
			i+=k-1+b;
			for(k=j;k<c&k<l;x[k++]++);
			j+=k-1+d;
		}
		System.out.println(Arrays.toString(x));
		System.out.println(x[p]);
		System.out.println(x[m]);
		System.out.println(x[n]);
	}

}
