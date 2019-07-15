package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9411 {

	static class Struct{
		int[] arr=new int[30];
		int c,l;
		boolean sign=true;
		Struct(String[] arr,int c,boolean sign,int l) {
			for(int i=0;i<arr.length;i++) this.arr[i]=Integer.parseInt(arr[i]);
			this.c=c;
			this.sign=sign;
			this.l=l;
		}
		double get() {
//			System.out.println("call get: "+Arrays.toString(arr));
			String r="";
//			if(!sign) r+="-";
			for(int i=0;i<this.l;i++) {
//				System.out.println(r);
//				System.out.println(arr[i]);
				r+=""+this.arr[i];
			}
//			System.out.println(r);
			return Double.parseDouble(r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		for(int i=0;i<N;i++) {
			String t=s.nextLine(),arr[];
			double d=s.nextDouble();
			System.out.println(t);
			boolean sign=false;
			if(t.substring(0,1).equals("-")) sign=true;
			if(sign) t=t.substring(1,t.length());
			System.out.println(t);
			int c=t.indexOf(".");
			t=t.substring(0,c)+t.substring(c+1,t.length());
			System.out.println(t);
			arr=t.split("");
			Struct st=new Struct(arr,c,!sign,arr.length);
			System.out.println("input R:"+st.get());
		}
	}

}
