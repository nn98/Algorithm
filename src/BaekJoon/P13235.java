package BaekJoon;

public class P13235 {

	public static void main(String[] args) {
		String t=new java.util.Scanner(System.in).next(),r="true";
		int i=0,l=t.length();
		for(;i<l/2;i++)
			if(t.charAt(i)!=t.charAt(l-i))
				r="false";
		System.out.print(r);
	}

}
