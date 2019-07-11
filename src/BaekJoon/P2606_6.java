package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P2606_6 {
	//GG
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		ArrayList<Integer>[] arr=new ArrayList[N];
		boolean[] brr=new boolean[N];
		for(int i=0;i<M;i++) {
			int a=s.nextInt()-1,b=s.nextInt()-1;
			if(arr[a]==null) {
				arr[a]=new ArrayList<Integer>();
				arr[a].add(b);
			}
			else arr[a].add(b);
			if(arr[b]==null) {
				arr[b]=new ArrayList<Integer>();
				arr[b].add(a);
			}
			else arr[b].add(a);
		}
		int r=0;
		brr[0]=true;
		for(int i=0;i<arr.length;i++) {
			if(i==0) for(int j:arr[i]) brr[j]=true;
			else {
				if(brr[i]) for(int j:arr[i]) brr[j]=true;
				else {
					if(arr[i]!=null) {
						for(int j:arr[i]) {
							if(brr[j]) {
								brr[i]=true;
								for(int k:arr[i]) brr[k]=true;
								break;
							}
						}
					}
				}
			}
		}
		for(int i=0;i<N;i++) if(brr[i]) r++;
		System.out.println(r-1);
	}
}