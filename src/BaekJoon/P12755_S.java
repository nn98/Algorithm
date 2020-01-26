package BaekJoon;

public class P12755_S {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,l;
		while(n>0) {
			i++;
			String s=""+i;
			n-=l=s.length();
			if(n<=0)System.out.print(s.charAt(l-1+n));
		}
	}
}