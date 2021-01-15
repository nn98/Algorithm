package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 거꾸로긴 했지만 정렬은 됐네 대충

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
		@Override
		public String toString() {
			return String.format("[%d, %d]",s,e);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		T[]t=new T[n];
		while(i<n)t[i++]=new T(s.nextInt(),s.nextInt());
		System.out.println(Arrays.toString(t));
		Arrays.sort(t);
//		Collections.sort(t);
		System.out.println(t[0].compareTo(t[0]));
		System.out.println(t[0].compareTo(t[1]));
		System.out.println(t[1].compareTo(t[0]));
		System.out.println(Arrays.toString(t));
	}

}
