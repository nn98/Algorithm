package BaekJoon.String;
import java.util.Scanner;
public class P8595 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,f=0,c=0;
		long r=0;
		String a=s.next();
		System.out.println(a.substring(0,n));
		for(;i<n;i++) {
			if(c>0)
				if(a.charAt(i)>='0'&&a.charAt(i)<='9')continue;
				else {
					r+=Integer.parseInt(a.substring(f,i));
					c=0;
				}
			else
				if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
					f=i;
					c=1;
				}
				
		}
		System.out.println(i);
		if(c>0)r+=Integer.parseInt(a.substring(f,i+1));
		System.out.print(r);
	}
}