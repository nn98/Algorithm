package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

//DFS
public class P2606_5 {

	static int r=0,arr[];

	static class Node{
		int v;
		ArrayList<Node> n;
		Node(int v) {
			this.v=v;
			n=null;
		}
		void add(int a,int b) {
			if(this.v==a) {
				if(n==null) {
					n=new ArrayList<Node>();
					this.n.add(new Node(b));
				}
				else {
					this.n.add(new Node(b));
				}
			}
			else if(this.n!=null) {
				for(int i=0;i<n.size();i++)
					n.get(i).add(a, b);
			}
		}
		void search() {
			//			System.out.println("Node "+this.v);
			if(arr[this.v-1]==0) {
				r++;
				arr[this.v-1]=1;
			}
			if(this.n!=null)
				for(int i=0;i<n.size();i++)
					n.get(i).search();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		arr=new int[N];
		arr[0]=1;
		Node root=new Node(1);
		for(int i=0;i<M;i++) {
			int a=s.nextInt(),b=s.nextInt();
			root.add(a, b);
		}
		root.search();
		System.out.println(r);
	}
}
