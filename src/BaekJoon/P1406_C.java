package BaekJoon;

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
	public static void main(String[] args) {
		Node l=null,r=null,n;
		Scanner s=new Scanner(System.in);
		for(String i:s.next().split("")) {
			n=new Node(i);
			n.n=l;
			l=n;
		}
		n=l;
//		while(n!=null) {
//			System.out.println(n.v);
//			n=n.n;
//		}
		String t;
		int m=s.nextInt();
		for(;m-->0;) {
			switch(t=s.next()){
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
			case "P":
				n=new Node(s.next());
				n.n=l;
				l=n;
				break;
			}
		}
		while(l!=null) {
			n=l;
			l=l.n;
			n.n=r;
			r=n;
		}
		while(r!=null) {
			System.out.print(r.v);
			r=r.n;
		}
	}
}