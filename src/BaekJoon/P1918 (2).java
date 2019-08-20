import java.util.Scanner;

public class P1918 {
	
	static class Node{
		String v;
		Node n,p;
		Node(String v){
			this.v=v;
			n=null;
			p=null;
		}
		void push(String v) {
			if(this.n==null) {
				this.n=new Node(v);
				this.n.p=this;
			}
			else this.n.push(v);
			
		}
		String pop() {
			String r=this.v;
			if(this.p!=null)
				this.p.n=null;
			return r;
		}
	}
	static boolean isCol() {
		return col!=null;
	}
	static Node oper=null,per=null,col=null,save=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//A*(B+C)
		String[] t=s.nextLine().split("");
		for(String i:t) {
			switch(i) {
			case "+":
				System.out.println("add "+i);
				if(isCol()) {
					if(save==null) save=new Node(i);
					else save.push(i);
				} else {
					if(per==null) per=new Node(i);
					else per.push(i);
				}
				break;
			case "-":
				System.out.println("add "+i);
				if(isCol()) {
					System.out.println("col is ");
					if(save==null) save=new Node(i);
					else save.push(i);
				} else {
					System.out.println("col emp ");
					if(per==null) per=new Node(i);
					else per.push(i);
				}
				break;
			case "*":
				System.out.println("add "+i);
				if(isCol()) {
					if(save==null) save=new Node(i);
					else save.push(i);
				} else {
					if(per==null) per=new Node(i);
					else per.push(i);
				}
				break;
			case "/":
				System.out.println("add "+i);
				if(isCol()) {
					if(save==null) save=new Node(i);
					else save.push(i);
				} else {
					if(per==null) per=new Node(i);
					else per.push(i);
				}
				break;
			case "(":
				System.out.println("add "+i);
				if(!isCol()) col=new Node(i);
				else col.push(i);
				break;
			case ")":
				System.out.println(") - pop ( ");
				col.pop();
				oper.push(save.pop());
				break;
			default:
				System.out.println("add "+i);
				if(oper==null) oper=new Node(i);
				else oper.push(i);
			}
		}
		Node n=per;
		while(n.n!=null) {
			System.out.print(n.v);
			n=n.n;
		}
		while(n.p!=null) {
			oper.push(n.v);
			n=n.p;
		}
		n=oper;
		while(n!=null) {
			System.out.print(n.v);
			n=n.n;
		}
	}

}
