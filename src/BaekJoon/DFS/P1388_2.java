package BaekJoon.DFS;

import java.io.*;
import java.util.Arrays;

public class P1388_2 {

    static int n[]=new int[2],i,j,h[][],R;
    static char[][]a;
    static void o(int i,int j,int x) {
	h[i][j]++;
	for(int[]b:h)System.out.println(Arrays.toString(b));
	System.out.println();
	try {
	    Thread.sleep(300);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	R+=x;
	if(i<n[0]-1)if(h[i+1][j]<1)if(a[i+1][j]=='|')o(i+1,j,0);
	if(i>0)if(h[i-1][j]<1)if(a[i-1][j]=='|')o(i-1,j,0);
    }
    static void p(int i,int j,int x) {
	h[i][j]++;
	for(int[]b:h)System.out.println(Arrays.toString(b));
	try {
	    Thread.sleep(300);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	R+=x;
	if(j<n[1]-1)if(h[i][j+1]<1)if(a[i][j+1]=='-')p(i,j+1,0);
	if(j>0)if(h[i][j-1]<1)if(a[i][j-1]=='-')p(i,j-1,0);
    }
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	for(String s:r.readLine().split(" "))n[j++]=Integer.parseInt(s);
	h=new int[n[0]][n[1]];
	a=new char[n[0]][];
	for(;i<n[0];a[i++]=r.readLine().toCharArray());
	for(j=0;j<n[0];j++)for(i=0;i<n[1];i++)if(h[j][i]<1)if(a[j][i]=='|')o(j,i,1);else p(j,i,1);
	System.out.println(R);
    }

}
