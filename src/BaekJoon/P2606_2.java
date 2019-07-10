package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2606_2 {

	static int r=0,arr[][],his[],h=0;

//	public static void sol(int index) {
//		for(int i=0;i<arr[index].length;i++) {
//			if(arr[index][i]==1) {
//				boolean c=false;
//				for(int a=0;a<his.length;a++) {
//					if(his[a]==i) {
//						c=true;
//						break;
//					}
//				}
//				if(!c) {
//					his[j++]=i;
//					r++;
//				}
//				sol(i);
//			}
//		}
//	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt()+1,M=s.nextInt();
		arr=new int[N][N];
		his=new int[N];
		for(int i=0;i<M;i++) {
			arr[s.nextInt()][s.nextInt()]=1;
		}
		his[h++]=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j]==1) {
					boolean c=true;
					for(int k=0;k<his.length;k++) {
						if(his[k]==j) {
							c=false;
							break;
						}
					}
					if(c) {
						System.out.println(j);
						his[h++]=j;
						r++;
					}
				}
			}
		}
		System.out.println(r);
	}
}
