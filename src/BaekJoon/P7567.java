package BaekJoon;

public class P7567 {

	public static void main(String[] args) {
		String[]a=new java.util.Scanner(System.in).next().split("");
		int r=10,i=1;
		for(;i<a.length;r+=a[i++].equals(a[i-1])?5:10);
		System.out.print(r);
	}

}
