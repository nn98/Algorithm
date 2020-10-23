package BaekJoon;
import java.util.*;
public class P1672{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		char[]a=s.next().toCharArray(),b[]=new char[20][20];
		b[0][0]=b[6][19]=b[19][6]=b[0][2]=b[2][0]=65;
		b[2][2]=b[0][6]=b[6][0]=67;
		b[6][6]=b[2][19]=b[19][2]=b[0][19]=b[19][0]=71;
		b[19][19]=b[2][6]=b[6][2]=84;
//		System.out.println(a[i-1]-65+" "+(a[i]-65)+" "+b[a[i-1]-65][a[i]-65]+" ")
//		System.out.println(a)
//		,a[n]=0,System.out.println(a)
		for(;--n>0;a[n-1]=b[a[n-1]-65][a[n]-65]);
		System.out.println(a[0]);
	}
}