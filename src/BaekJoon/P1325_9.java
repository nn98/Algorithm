package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1325_9 {

	static boolean ar[][],h[];
	static int n,s[],k=0;
	static List[]r;

	static void o(int x,int X,ArrayList<Integer> l) {
		h[x]=true;
		if(r[x]==null)
			r[x]=new ArrayList<>();
		r[x].add(x);
		l.add(x);
		//		System.out.print("call o: "+x+", list: ");
		//		System.out.println(l);
		for(int i=0;i<n;i++) {
			if(ar[x][i]) {
				if(!h[i]) {
					r[x].add(i);
					o(i,X,(ArrayList<Integer>) l.clone());
				}
				else
					r[x].addAll(r[i]);
			}
		}
		for(int i:l) {
			if(!r[X].contains(i))
				r[X].add(i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
		String[]in=re.readLine().split(" ");
		n=Integer.parseInt(in[0]);
		int m=Integer.parseInt(in[1]);
		ar=new boolean[n][n];
		r=new List[n];
		h=new boolean[n];
		s=new int[n];
		for(;m>0;m--) {
			in=re.readLine().split(" ");
			int a=Integer.parseInt(in[0]),b=Integer.parseInt(in[1]);
			ar[b-1][a-1]=true;
		}
		//		for(boolean[]i:ar)
		//			System.out.println(Arrays.toString(i));
		for(int i=0;i<n;i++) {
			ArrayList<Integer> l=new ArrayList<>();
			if(r[i]==null)
				r[i]=new ArrayList<>();
			if(!h[i])
				o(i,i,l);
			k=r[k].size()>r[i].size()?k:i;
		}
		for(int i=0;i<n;i++)
			if(r[i].size()==r[k].size())
				System.out.print(i+1+" ");
//		for(List i:r)
//			System.out.println(i);
		//		System.out.println(Arrays.toString(r));
		//		for(int i=0;i<n;i++)
		//			if(r[i]==r[m])
		//				System.out.print(i+1+" ");
		
	}
}