package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//순환 스택오버플로우
public class P2606 {

	static int r=0,arr[][],his[],j=0;

	public static void sol(int index) {
		for(int i=0;i<arr[index].length;i++) {
			if(arr[index][i]==1) {
				boolean c=false;
				for(int a=0;a<his.length;a++) {
					if(his[a]==i) {
						c=true;
						break;
					}
				}
				if(!c) {
					arr[index][i]=0;
					his[j++]=i;
					r++;
				}
				sol(i);
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt()+1,M=s.nextInt();
		arr=new int[N][N];
		his=new int[N];
		for(int i=0;i<M;i++) {
			arr[s.nextInt()][s.nextInt()]=1;
		}
		sol(1);
		System.out.println(r);
	}
}
