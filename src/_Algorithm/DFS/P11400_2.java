package _Algorithm.DFS;
//¾¯ÀÌ,,,¹ú Á¸³ª ¾î·Æ³×
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P11400_2 {
	static List[]l;
	static int m,dis[],i,j;
	static int o(int a,int p) {
		dis[a]=++m;
		int r=dis[a],i;
		for(Object I:l[a]) {
			i=(Integer)I;
			if(i==p)continue;
			if(dis[i]==0) {
				int q=o(i,a);
				if(q>dis[a])
					if(i<a)l[0].add(new int[] {i,a});
					else l[0].add(new int[] {a,i});
				r=r<q?r:q;
			} else r=r<dis[i]?r:dis[i];
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt()+1,e=s.nextInt();
		dis=new int[v];
		l=new ArrayList[v];
		for(i=v;i-->0;l[i]=new ArrayList());
		for(;e-->0;i=s.nextInt(),j=s.nextInt(),l[i].add(j),l[j].add(i));
		o(1,0);
		System.out.println(l[0].size());
		Collections.sort(l[0],new Comparator<int[]>() {
			@Override
			public int compare(int[]o0,int[]o1) {
				if(o0[0]==o1[0])return o0[1]-o1[1];
				return o0[0]-o1[0];
			}
		});
		for(Object r:l[0]) {
			int[]R=(int[]) r;
			System.out.println(R[0]+" "+R[1]);
		}
	}
}