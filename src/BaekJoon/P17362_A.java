package BaekJoon;
import java.util.Scanner;

public class P17362_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>5){
			n-=5;
			int a=n/4,b=n%4;
			boolean c=a%2==0?true:false;
			if(c) {
				if(b==0) n=5;
				else n=5-b;
			}
			else {
				if(b==0) n=1;
				else n=b+1;
			}
		}
		System.out.println(n);
	}

}
