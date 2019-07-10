package ConTest;

import java.util.Scanner;

public class C442_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int L=s.nextInt(),arr[]=new int[L];
		boolean r=true;
		for(int i=0;i<L;i++) {
			if(!r) break;
			int t=s.nextInt();
			arr[i]=t;
			int j=0;
			while(j<i) {
				if(arr[j]==t) {
					r=false;
					break;
				}
				j++;
			}
		}
		boolean c=false;
		for(int i=1;i<L;i++) {
			if(!r) break;
			if(Math.abs(arr[i]-arr[i-1])==1) c=true;
			if(Math.abs(arr[i]-arr[i-1])==L) c=true;
		}
	}
}
