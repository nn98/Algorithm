package BaekJoon.Greedy;
import java.io.*;
public class P11047 {
    static int a[]=new int[2],b[],i,j;
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	for(String s:r.readLine().split(" "))a[i++]=Integer.parseInt(s);
	b=new int[a[0]];
	for(i=0;i<a[0];b[i++]=Integer.parseInt(r.readLine()));
	for(i=a[0];i-->0&a[1]>0;j+=a[1]/b[i],a[1]%=b[i]);
	System.out.print(j);
    }
}