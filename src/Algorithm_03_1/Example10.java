package Algorithm_03_1;

import java.util.Arrays;

public class Example10 {
	static int count=0;
	//문자정렬2
	public static void sort(char[] arr,int f,int t) {
		
		if(f==t) return;
		int m=(f+t)/2;
		sort(arr,f,m);
		sort(arr,m+1,t);
		merge(arr,f,m,t);
		
	}
	
	public static void merge(char[] arr, int f, int m, int t) {
		char[] r=new char[t-f+1];
		int a=f,b=m+1,i=0;;
		
		/* 
		for(int i=0;a<=m&&b<=t;++i) {
			if (b>t) r[i]=arr[a++];
			else if (a>m) r[i]=arr[b++];
			else r[i]=(arr[a]<arr[b])?arr[a++]:arr[b++];
			System.out.println(Arrays.toString(r));
		} */
		
		while(a<=m&&b<=t) {
			if(arr[a]<arr[b]) r[i++]=arr[a++];
			else r[i++]=arr[b++];
		}
		while(a<=m) r[i++]=arr[a++];
		while(b<=t) r[i++]=arr[b++];
		for(i=0;i<r.length;i++) arr[f+i]=r[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 병합정렬
		char[] arr="sdafzcxvzxfXVXCAIJOS".toCharArray();
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
