package BaekJoon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P15649_3 {

	static int n,m,a[],i=1;
	static List<String>r;
	
	static void o(int x,String s) {
		if(x==n) {
			if(s.length()==m*2) {
				r.add(s.substring(1));
				r.add(new StringBuffer(s).reverse().toString());
//				if(s.split(" ").length>=2) {
//					r.add(new StringBuffer(s).reverse().toString());
//				}
			}
			return;
		}
		o(x+1,""+s);
		o(x+1,s+" "+a[x]);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(Arrays.toString(" 1 ".split(" ")));
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		r=new ArrayList<>();
		for(;i<=n;i++)a[i-1]=i;
		o(0,"");
		Collections.sort(r);
		for(String t:r)
			System.out.println(t);
	}

}
