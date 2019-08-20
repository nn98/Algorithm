package BaekJoon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class P2606_7 {

	static int N,c=0;
	static ArrayList<Integer>[] arr;
	static boolean[] his;
	
	static void BFS(int s) {
		
		boolean[] v=new boolean[N];
		Queue<Integer> q=new ArrayDeque<Integer>();
		q.add(s);
		while(q.size()>0) {
			int t=q.remove();
			if(v[t]) continue;
			System.out.print(t+1+" ");
			v[t]=true;
			for(int i:arr[t]) {
				if(v[i]) continue;
				q.add(i);
			}
		}
		
	}
	
	static void DFS(int s) {
		if(s!=0) c++; 
		if(his[s]) return;
//		System.out.print(s+1+" ");
		his[s]=true;
		for(int i:arr[s]) {
			if(his[i]) continue;
			DFS(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		arr=new ArrayList[N];
		for(int i=0;i<N;i++) arr[i]=new ArrayList<>();
		int M=s.nextInt(),S=0;
		for(int i=0;i<M;i++) {
			int a=s.nextInt()-1,b=s.nextInt()-1;
			arr[a].add(b);
			arr[b].add(a);
		}
		his=new boolean[N];
		for(int i=0;i<arr.length;i++) Collections.sort(arr[i]);;
		DFS(S);
		System.out.println(c);
//		System.out.println();
//		BFS(S);
	}
}