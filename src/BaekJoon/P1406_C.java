package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://dundung.tistory.com/6
public class P1406_C {

	static class Node{
		String v;
		Node n;
		Node(String v){
			this.v=v;
		}
	}
	public static void main(String[] args)throws Exception{
		Node l=null,r=null,n;
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(String i:R.readLine().split("")) {
			n=new Node(i);
			n.n=l;
			l=n;
		}
		String t;
		n=l;
//		while(n!=null) {
//			System.out.println(n.v);
//			n=n.n;
//		}String t;
		int m=Integer.parseInt(R.readLine());
		for(;m-->0;) {
//			switch(t=r.readLine()){
//			case "L":
//				if(i>0)i--;
//				break;
//			case "D":
//				if(i<l.size())i++;
//				break;
//			case "B":
//				if(i>0)l.remove(i---1);
//				break;
//			default:
//				l.add(i++,t.substring(t.length()-1));
//				break;
//			}
			switch(t=R.readLine()){
			case "L":
				if(l==null)break;
				n=l;
				l=l.n;
				n.n=r;
				r=n;
				break;
			case "D":
				if(r==null)break;
				n=r;
				r=r.n;
				n.n=l;
				l=n;
				break;
			case "B":
				if(l!=null)l=l.n;
				break;
			default:
				n=new Node(s.next());
				n.n=l;
				l=n;
				break;
			}
		}
		while(l!=null){
			n=l;
			l=l.n;
			n.n=r;
			r=n;
		}
		while(r!=null) {
			w.write(r.v);
			r=r.n;
		}
		w.flush();
	}
}