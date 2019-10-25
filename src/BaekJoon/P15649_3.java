package BaekJoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P15649_3 {

	static int n,m,a[],i=1;
	static List<String>r;
	
	static void o(int x,String s) {
		if(x==n) {
			if(s.length()==m*2)
				r.add(s);
			return;
		}
		o(x+1,""+s);
		o(x+1,s+" "+a[x]);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		r=new ArrayList<>();
		for(;i<=n;i++)a[i-1]=i;
		o(0,"");
		Collections.sort(r);
		for(String t:r)
			System.out.println(t.substring(1));
	}

}
