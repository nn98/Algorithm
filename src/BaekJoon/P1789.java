package BaekJoon;

public class P1789 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,c=0;
		for(;n>0;c++,n-=i++);
		System.out.print(c);
	}

}
