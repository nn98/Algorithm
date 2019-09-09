package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P2606_3 {
	static int his[],h=0,r=0;
	static class Node{
		int n;
		ArrayList<Node> next=new ArrayList<Node>();
		public Node(int n) {
			this.n=n;
		}
		public void add(int n,int t) {
			if(this.n==n)
				next.add(new Node(t));
			for(int i=0;i<next.size();i++) {
				next.get(i).add(n, t);
			}
		}
		public int search() {
			boolean c=false;
			int re=0;
			for(int i=0;i<his.length;i++) {
				if(this.n==his[i]) {
//					System.out.println("duplecate "+this.n);
					c=true;
					break;
				}
			}
			if(!c) {
//				System.out.println("search "+this.n);
				his[h++]=this.n;
				if(this.n!=1)
					re++;
				for(int i=0;i<next.size();i++) {
					re+=next.get(i).search();
				}
			} else {
//				for(int i=0;i<next.size();i++) {
//					re+=next.get(i).search();
//				}
			}
			return re;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		Node root=new Node(1);
		String[] arr=new String[M];
		his=new int[N];
		for(int i=0;i<M;i++) {
			int a=s.nextInt(),b=s.nextInt();
			arr[i]=a+" "+b;
			for(int j=0;j<=i;j++) {
				String[] n=arr[j].split(" ");
				root.add(Integer.parseInt(n[0]), Integer.parseInt(n[1]));
				root.add(Integer.parseInt(n[1]), Integer.parseInt(n[0]));
			}
		}
		int re=root.search();
		System.out.println(re);
	}

}
