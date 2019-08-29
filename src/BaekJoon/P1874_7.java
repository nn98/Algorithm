package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1874_7 {
	//??? StringBuiler/BufferedWriter Â÷ÀÌ???????
	static class Node{
		int v;
		Node n;
		Node(int v) { 
			this.v=v;
			this.n=null;
		}
		void pop() {
			top=top.n;
		}
		void push(int v) {
			Node n=new Node(v);
			n.n=top;
			top=n;
		}
	}
	
	static Node top;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n],add=1,now=0,index=0;
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
//		int n=s.nextInt(),arr[]=new int[n],index=0,add=1;
//		for(int i=0;i<n;i++) {
//			arr[i]=0;
//		}
//		bw.write("+\n");
//		top=new Node(add++);
//		System.out.println(top.v);
//		top.push(2);
//		System.out.println(top.v);
//		top.push(3);
//		System.out.println(top.v);
//		top.pop();
//		System.out.println(top.v);
		StringBuilder sb=new StringBuilder();
		while(index<n) {
			if(top==null) {
//				bw.write("+\n");
				sb.append("+\n");
				top=new Node(add++);
			}
			if(top.v==arr[index]) {
//				if(index==n-1) bw.write("-");
//				else bw.write("-\n");
				sb.append("-\n");
				top.pop();
				index++;
				continue;
			}
			if(top.v>arr[index]) {
//				bw=new BufferedWriter(new OutputStreamWriter(System.out));
//				bw.write("NO");
				System.out.println("NO");
//				break;
				return;
			}
			if(top.v<arr[index]) {
//				bw.write("+\n");
				sb.append("+\n");
				top.push(add++);
			}
		}
//		bw.flush();
		System.out.print(sb.toString());
	}
}