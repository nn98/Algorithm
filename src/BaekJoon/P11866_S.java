package BaekJoon;

import java.util.Scanner;

public class P11866_S {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),c=n-1,i=k;
		boolean[] arr=new boolean[n+1];
		arr[k]=true;
		String r="<"+i;
		while(c-->0){
			for(int j=0;j<k;j++){
				if(++i>n)i=1;
				if(arr[i])j--;
			}
			r+=", "+i;
			arr[i]=true;
		}
		r+=">";
		System.out.print(r);
	}
}