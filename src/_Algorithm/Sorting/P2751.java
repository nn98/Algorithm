package _Algorithm.Sorting;
//시간초과 존나게나네
//스캐너는 드럽게 느라디
import java.io.*;

public class P2751 {
	
	static int n,s,l,r,t,i,a[];
	static void o() {
		b();
		for(;n>=1;) {
			w(0,n--);
			h(0);
		}
	}
	static void b() {
		for(i=(n-1)/2;i>=0;i--)h(i);
	}
	static void h(int x) {
		l=x*2+1;
		r=x*2+2;
		if(r<=n)s=a[l]>a[r]?l:r;
		else if(l<=n)s=l;
		else return;
		if(a[x]<a[s]) {
			w(x,s);
			h(s);
		}
	}
	static void w(int x,int y) {
		t=a[x];
		a[x]=a[y];
		a[y]=t;
	}

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
//		n=s.nextInt();
//		while(S-1<n)S*=2;
//		System.out.println(--S);
//		a=new int[S];
		a=new int[n=Integer.parseInt(r.readLine())];
		for(;l<n;a[l++]=Integer.parseInt(r.readLine()));
//		System.out.println(Arrays.toString(a));
		n--;
		o();
		for(int j:a)w.write(j+"\n");
		w.flush();
//		System.out.println(Arrays.toString(a));
//		b();
//		System.out.println(Arrays.toString(a));
	}
}