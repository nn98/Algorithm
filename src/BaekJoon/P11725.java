package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11725 {

	static class Node{
		int self,con,l;
		Node(){

		}
		Node(int a,int b,boolean c) {
			this.self=a;
			if(c) this.con=b;
			else this.l=b;
		}
		void setC() {
			this.con=this.l;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		Node[] arr=new Node[N];
		arr[0]=new Node();
		boolean brr[]=new boolean[N];
		brr[0]=true;
		//		if(arr[0].d==0) System.out.println("h");
		for(int i=1;i<N;i++) {
			int a=s.nextInt()-1,b=s.nextInt()-1;
			if(brr[a]) {
				if(arr[b]==null) arr[b]=new Node(b,a,true);
				else {
					arr[b].setC();
				}
				brr[b]=true;
			}
			else if(brr[b]){
				if(arr[a]==null) arr[a]=new Node(a,b,true);
				else {
					arr[a].setC();
				}
				brr[a]=true;
			}
			else {
				if(arr[a]==null) arr[a]=new Node(a,b,false);
				if(arr[b]==null) arr[b]=new Node(b,a,false);
			}
		}
		System.out.println(Arrays.toString(brr));
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i].con+1);
		}
	}

}
