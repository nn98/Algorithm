package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11400 {
	static class Pair<L,R> {
		final L left;
		final R right;

		public Pair(L left, R right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((left == null) ? 0 : left.hashCode());
			result = prime * result + ((right == null) ? 0 : right.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (left == null) {
				if (other.left != null)
					return false;
			} else if (!left.equals(other.left))
				return false;
			if (right == null) {
				if (other.right != null)
					return false;
			} else if (!right.equals(other.right))
				return false;
			return true;
		}

		static <L,R> Pair<L,R> of(L left, R right){
			return new Pair<L,R>(left, right);
		}
	}
	static List[]l;
	static int m,dis[],i,j;
	static int o(int x,int p) {
		dis[x]=++m;
		int ret=dis[x],i=0;
		for(;i<l[x].size();i++) {
			int nex=(int)l[x].get(i);
			if(nex==p)continue;
			if(dis[nex]>0) {
				ret=Math.min(ret,dis[nex]);
				continue;
			}
			int pre=o(nex,x);
			if(pre>dis[x])l[0].add(new Pair(x<nex?x:nex,x<nex?x:nex));
			ret=Math.min(ret, pre);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt()+1,e=s.nextInt();
		dis=new int[v];
		l=new ArrayList[v];
		for(i=v;i-->0;l[i]=new ArrayList());
		for(;e-->0;i=s.nextInt(),j=s.nextInt(),l[i].add(j),l[j].add(i));
		for(i=0;++i<v;j=dis[i]==0?o(i,0):0);
		System.out.println(l[0].size());
		Collections.sort(l[0]);
		for(i=0;i<l[0].size();System.out.println(l[0].get(i++)));
	}

}
