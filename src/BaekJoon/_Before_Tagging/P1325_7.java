package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class P1325_7 {

	static boolean ar[][],h[];
	static int n,r[],m;
	
	static void o(int x,ArrayList<Integer> l) {
		h[x]=true;
		l.add(x);
//		System.out.print("call o: "+x+", list: ");
//		System.out.println(l);
		for(int i:l) {
			r[i]++;
		}
		for(int i=0;i<n;i++) {
			if(ar[x][i]) {
				if(!h[i])
				o(i,(ArrayList<Integer>) l.clone());
				else
					r[x]+=r[i];
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
		String[]in=re.readLine().split(" ");
		n=Integer.parseInt(in[0]);
		int m=Integer.parseInt(in[1]);
		ar=new boolean[n][n];
		r=new int[n];
		h=new boolean[n];
		for(;m>0;m--) {
			in=re.readLine().split(" ");
			int a=Integer.parseInt(in[0]),b=Integer.parseInt(in[1]);
			ar[b-1][a-1]=true;
		}
//		for(boolean[]i:ar)
//			System.out.println(Arrays.toString(i));
		for(int i=0;i<n;i++) {
			ArrayList<Integer> l=new ArrayList<>();
			if(!h[i])
				o(i,l);
			m=r[m]>r[i]?m:i;
		}
		System.out.println(Arrays.toString(r));
		for(int i=0;i<n;i++)
			if(r[i]==r[m])
				System.out.print(i+1+" ");
	}
}