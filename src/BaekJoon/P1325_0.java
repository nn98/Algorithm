package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P1325_0 {

	static ArrayList<Integer>[] arr;
	static boolean[] his;
	static int[] c;
	
	static int sol(int index) {
		int r=1;
		if(arr[index]==null) return r;
		for(int i=0;i<arr[index].size();i++) {
			r+=sol(arr[index].get(i));
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),max=0;
		arr=new ArrayList[n];
		his=new boolean[n];
		c=new int[n];
		for(int i=0;i<m;i++) {
			int a=s.nextInt(),b=s.nextInt();
			if(arr[b]==null) arr[b]=new ArrayList<>();
			arr[b].add(a);
		}
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=null)
//			System.out.println(i+" "+arr[i].toString());
//		}
		for(int i=1;i<n;i++) {
			c[i]=sol(i);
			max=max>c[i]?max:c[i];
		}
		for(int i=1;i<n;i++) {
			if(c[i]==max) System.out.print(i+" ");
		}
	}
}