import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3187 {

	static int n,m,i,j,h[][],p,q,d[]= {0,1,0,-1},b[]= {1,0,-1,0},P,Q;
	static char[][]a;
	static void o(int x,int y) {
//		System.out.println(x+" "+y);
		h[x][y]++;
		switch(a[x][y]) {
		case 'k':
			p++;
			break;
		case 'v':
			q++;
			break;
		}
		for(int i=0;i<4;i++) {
			int X=x+d[i],Y=y+b[i];
			if(X>=0&X<n&Y>=0&Y<m) {
				if(a[X][Y]!='#'&h[X][Y]<1)o(X,Y);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new char[n][m];
		h=new int[n][m];
		for(;i<n;a[i++]=r.readLine().toCharArray());
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(h[i][j]<1&a[i][j]!='#') {
					o(i,j);
//					System.out.println("\t"+p+" "+q);
					P+=p>q?p:0;
					Q+=p>q?0:q;
					q=p=0;
				}
			}
		}
		System.out.println(P+" "+Q);
	}

}
