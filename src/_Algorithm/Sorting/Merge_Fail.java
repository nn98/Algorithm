package _Algorithm.Sorting;
//실패!
//난 제대로되는데 ㅅㅂ
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Fail {

	static int n,i,j,a[],b[];
	static void m(int f,int t) {
		//System.out.println(f+" "+t+"\t"+(t+f)/2);
		if(j++>100)return;
		if(f==t)return;
		if(t-f==1) {
			if(a[f]>a[t]) {
				//System.out.println("\t"+Arrays.toString(a));
				int c=a[f];
				a[f]=a[t];
				a[t]=c;
				//System.out.println("\t"+Arrays.toString(a));
			}
			return;
		}
		int c=(t+f)/2;
//		//System.out.println("\t"+f+" "+c+" "+t);
		m(f,c-1);
		m(c,t);
		//System.out.println(f+" "+c+" "+t+" "+Arrays.toString(a));
		o(f,t,c);
		//System.out.println("\t\t"+Arrays.toString(a));
	}
	static void o(int f,int t,int c) {
		int x=f,y=c,z=0,w=0;
		//System.out.println("o1 "+Arrays.toString(b));
		while(!(x==c&&y==t+1)) {
			if(x==c) b[z++]=a[y++];
			else if(y==t+1)b[z++]=a[x++];
			else b[z++]=a[x]<a[y]?a[x++]:a[y++];
		}
		//System.out.println("o2 "+Arrays.toString(b));
		while(f<=t)a[f++]=b[w++];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		//System.out.println(Arrays.toString(a));
		//System.out.println();
		m(0,n-1);
		//System.out.println(Arrays.toString(a));
		for(i=0;i<n;System.out.println(a[i++]));
	}

}
