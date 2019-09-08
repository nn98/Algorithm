package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5639_2_A {

	static class Node{
		int v;
		Node l,r;
		Node(int v) {
			this.v=v;
			l=null;
			r=null;
		}
		void add(int v) {
			if(v<this.v) {
				if(this.l==null)
					this.l=new Node(v);
				else this.l.add(v);
			}
			else if(v>this.v) {
				if(this.r==null) 
					this.r=new Node(v);
				else this.r.add(v);
			}
		}
		void search() {
			if(l!=null)
			l.search();
			if(r!=null)
			r.search();
			System.out.println(v);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Node root=new Node(Integer.parseInt(br.readLine()));
		String s="";
		while ((s = br.readLine()) != null && s.length() != 0) {
			root.add(Integer.parseInt(s));
		}
		root.search();
	}

}
