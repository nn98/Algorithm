package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1005_3 {
	//시발 건설시간 0시간 가능 ㅇㅈㄹ
	//입출력시간 단축 필요 x
	static int n,a[],b[][],d[];
	static int sol(int i) {
		//		System.out.println("sol"+i);
		boolean l=true;
		for(int j:b[i]) {
			if(j>0) {
				l=false;
				break;
			}
		}
		if(l)return d[i]=a[i];
		else {
			int m=0,p;
			for(int j=0;j<n;j++) {
				//				System.out.println(i+" "+j);
				if(b[i][j]>0) {
					if(d[j]<0)
						p=sol(j);
					else 
						p=d[j];
					m=m>p?m:p;
				}
			}
			return d[i]=m+a[i];
		}
	}

	public static void main(String[] args) throws IOException {
//		Scanner s=new Scanner(System.in);
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer s;
		for(int i=Integer.parseInt(r.readLine());i>0;i--) {
			s=new StringTokenizer(r.readLine());
			n=Integer.parseInt(s.nextToken());
			d=new int[n];
			Arrays.fill(d,-1);
			int m=Integer.parseInt(s.nextToken()),t,x,y;
			a=new int[n];
			b=new int[n][n];
			s=new StringTokenizer(r.readLine());
			for(int j=0;j<n;j++)a[j]=Integer.parseInt(s.nextToken());
			for(int j=0;j<m;j++) {
				s=new StringTokenizer(r.readLine());
				x=Integer.parseInt(s.nextToken())-1;
				y=Integer.parseInt(s.nextToken())-1;
				b[y][x]++;
			}
			//			for(int j=0;j<n;j++)System.out.println(Arrays.toString(b[j]));
			t=Integer.parseInt(r.readLine())-1;
			w.write(""+sol(t)+"\n");
		}
		w.flush();
	}
}
