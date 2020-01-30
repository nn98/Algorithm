package BaekJoon;

public class P1789{
	public static void main(String[] args){
		long n=new java.util.Scanner(System.in).nextLong(),i=1,c=0;
		for(;n-i>=0;c++,n-=i++);
		System.out.print(c);
	}
}