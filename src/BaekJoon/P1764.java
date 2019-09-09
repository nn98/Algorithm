package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),c=0;
		String r=null;
		String[] arr=new String[n];
		String[] brr=new String[m];
		for(int i=0;i<n;i++) arr[i]=s.next();
		for(int i=0;i<m;i++) brr[i]=s.next();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				if(arr[i].equals(brr[j])) {
					c++;
					if(r==null) r=arr[i];
					else r+="\n"+arr[i];
				}
			}
		}
		String[] result=r.split("\n");
		Arrays.sort(result);
		System.out.println(c);
		for(String i:result) System.out.println(i);
	}
}
