package BaekJoon;

import java.util.*;
class P5800{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int m=s.nextInt(),arr[]=new int[m],g=0;
			for(int j=0;j<arr.length;j++) arr[j]=s.nextInt();
			Arrays.sort(arr);
			for(int j=0;j<arr.length-1;j++) if(arr[j+1]-arr[j]>g) g=arr[j+1]-arr[j];
			System.out.printf("Class %d\nMax %d, Min %d, Largest gap %d\n",(i+1),arr[arr.length-1],arr[0],g);
		}
	}
}