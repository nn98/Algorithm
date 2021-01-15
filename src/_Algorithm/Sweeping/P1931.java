package _Algorithm.Sweeping;

import java.util.Arrays;
import java.util.Scanner;

public class P1931 {

	static class T implements Comparable<T>{
		int s,e;
		T(int s,int e){
			this.s=s;
			this.e=e;
		}
		@Override
		public int compareTo(T t) {
			if(this.e==t.e)return this.s-t.s;
			return this.e-t.e;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		T[]t=new T[n];
		while(i<n)t[i++]=new T(s.nextInt(),s.nextInt());
		System.out.println(Arrays.toString(t));
		Arrays.sort(t);
		System.out.println(Arrays.toString(t));
	}

}
