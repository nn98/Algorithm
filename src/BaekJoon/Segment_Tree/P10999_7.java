package BaekJoon.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10999_7 {
    static int j,n,m,l;
    static long a[],b[],x,y,i;
    static void o(){
	for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
    }
    static void u(int n,int s,int e){
	if(b[n]!=0){
	    a[n]+=(e-s+1)*b[n];
	    if(s!=e){
		b[n*2]+=b[n];
		b[n*2+1]+=b[n];
	    }
	    b[n]=0;
	}
	if(y<s|x>e)return;
	if(x<=s&e<=y){
	    a[n]+=(e-s+1)*i;
	    if(s!=e){
		b[n*2]+=i;
		b[n*2+1]+=i;
	    }
	    return;
	}
	int m=(s+e)/2;
	u(n*2,s,m);
	u(n*2+1,m+1,e);
	a[n]=a[n*2]+a[n*2+1];
    }
    static long U(int n,int s,int e){
	if(b[n]!=0){
	    a[n]+=(e-s+1)*b[n];
	    if(s!=e){
		b[n*2]+=b[n];
		b[n*2+1]+=b[n];
	    }
	    b[n]=0;
	}
	if(x>e|y<s)return 0;
	if(x<=s&e<=y)return a[n];
	int m=(s+e)/2;
	return U(n*2,s,m)+U(n*2+1,m+1,e);
    }
    public static void main(String[]z)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	String s;
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
	l=1;
	for(;l<n;l*=2);
	a=new long[l*2];
	b=new long[l*2];
	for(;i<n;j=l+(int)i++,a[j]=Long.parseLong(r.readLine()),o());
	while(m-->0){
	    t=new StringTokenizer(r.readLine());
	    s=t.nextToken();
	    x=Integer.parseInt(t.nextToken());
	    y=Integer.parseInt(t.nextToken());
	    if(s.equals("1")){
		i=Long.parseLong(t.nextToken());
		u(1,1,l);
	    }else System.out.println(U(1,1,l));
	}
    }
}