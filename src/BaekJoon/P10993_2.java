package BaekJoon;

public class P10993_2 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),m=1;
		for(int i=1;i<n;i++)m+=Math.pow(2, i)*2;
		System.out.println(n+" "+m);
	}

}
