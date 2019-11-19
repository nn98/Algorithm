package BaekJoon;

public class P1918_4 {
	static N t=null;
	private static String i;
	static class N {
		String v;
		N N;
		N(String v){
			this.v=v;
			this.N=t;
			t=this;
		}
		String peek() {
			return v;
		}
		String pop() {
			String v=this.v;
			t=t.N;
			return v;
		}
		boolean isL() {
			return N==null;
		}
	}
	static int O(String s) {
		int r=-1;
		if(s.equals("(")||s.equals(")"))
			r=0;
		if(s.equals("+")||s.equals("-"))
			r=1;
		if(s.equals("*")||s.equals("/"))
			r=2;
		return r;
	}
	public static void main(String[] args) {
//		StringBuffer s=new StringBuffer(new java.util.Scanner(System.in).next()),
//				r=new StringBuffer();
		String r="",s[]=new java.util.Scanner(System.in).next().split("");
		for(String i:s) {
//			System.out.println("i: "+i);
			switch(O(i)) {
			case 0:
				if(i.equals("("))
					new N(i);
				else {
					while(!t.peek().equals("("))
						System.out.print(t.pop());
					t.pop();
				}
				break;
			case 1:
				if(t!=null&&O(t.peek())<1)
					System.out.print(t.pop());
				else
					new N(i);
				break;
			case 2:
				if(t!=null&&O(t.peek())<2)
					System.out.print(t.pop());
				else
					new N(i);
				break;
			default:
				System.out.print(i);
			}
		}
		while(t!=null)
			System.out.print(t.pop());
	}

}
