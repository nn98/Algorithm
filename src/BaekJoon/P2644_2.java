package BaekJoon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;


public class P2644_2 {
	
	static ArrayList<Integer>[] arr;
	static int N;
	
	static int sol(int f,int t,int d) {
		Queue<Node> q=new ArrayDeque<>();
		boolean[] v=new boolean[N];
//		q.add(new Node(f,))
		return -1;
	}
	
	static class Node{
		int self,pare;
		Node(int p,int s){
			this.self=s;
			this.pare=p;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int f=s.nextInt(),t=s.nextInt(),c=s.nextInt();
		arr=new ArrayList[N+1];
		for(int i=0;i<N+1;i++) arr[i]=new ArrayList<>();
		for(int i=0;i<c;i++) {
			arr[s.nextInt()].add(s.nextInt());
		}
		System.out.println(sol(f,t,0));
	}

}