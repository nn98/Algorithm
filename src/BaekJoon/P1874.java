package BaekJoon;

import java.util.Scanner;

public class P1874 {
	static Stack root=null;
	static class Stack{
		int v;
		Stack s=null;
		public Stack(int v) {
			this.v=v;
		}
		public void push(int v) {
			Stack s=root;
			root=new Stack(v);
			root.s=s;
		}
		public int peek() {
			return v;
		}
		public int pop() {
			int n=this.v;
			root=this.s;
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=0,i=1;
		int[] arr=new int[n],c=new int[n];
		String r="";
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();
		}
		for(;k<n;) {
			if(root==null) {
				root=new Stack(i);
				r+="+\n";
				i++;
			}
			if(root.peek()==arr[k]) {
				root.pop();
				r+="-\n";
				k++;
			} else if(root.peek()>arr[k]) {
				root.pop();
				r+="-\n";
				k++;
			} else if(root.peek()<arr[k]) {
				root.push(i);
				r+="+\n";
				i++;
			} else break;
		}
		if(root!=null) System.out.println("NO");
		else System.out.println(r);
	}
}
