package BaekJoon.Recursive;
//�ù� ��� �򰥸�

public class P11729 {
	static StringBuffer s=new StringBuffer();
	static int r,i=-2,j;
	static void o(int n,int f,int b,int t) {
		r++;
		if(n==1)s.append("\n"+f+" "+t);
		else {
			o(n-1,f,t,b);
			s.append("\n"+f+" "+t);
			o(n-1,b,f,t);
		}
	}
	public static void main(String[] args) {
		o(new java.util.Scanner(System.in).nextInt(),1,2,3);
		System.out.println(""+r+s);
	}

}