package BaekJoon.Sweeping;
// ���� ��� �迭?
import java.io.*;
import java.util.*;
public class P2104_5 {
	static int n,m,i,k,a[],s[];
	static long R,w,e,h,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine())+1;	// �� n�� 1 ������ �ص� ����
		a=new int[n+1];
		u=new long[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;++i<n;) {
			a[i]=Integer.parseInt(t.nextToken());
			u[i]=u[i-1]+a[i];				// �Է¹����鼭 �� �迭�� �� ����
		}
		a[n]=0;								// �� �迭 ������ ĭ(n+1)�� 0
		s=new int[n];						// ���� ��� �ε��� �迭?
		for(i=1;i<=n;i++) {					// 1���� ������ ĭ(n+1)����
			System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(u)+"\n"+Arrays.toString(s)+"\n"+w);
			while(a[s[m]]>=a[i]) {			// ���� [�ε��� �迭 [�ε���]]�� ���� ���� [i]������ ũ�ų� ���� ����
				int h=a[s[m--]];			// h=���� [�ε��� �迭 [�ε���]]�� ��
				if(m<0)break;				// �ε����� ������ �ƿ�
				long v=h*(u[i-1]-u[s[m]]);	// ������� h(���� [�ε��� �迭 [�ε���]]�� ��)*
				System.out.printf("\t%d * ( %d - %d ) = %d\n",h,u[i-1],u[s[m]],v);
				// ���� ������ ���ڶ� �� �������� ������ �ʿ��ϴ�
				// �ڱ⺸�� ū ���� �־��� == ���� ���� ���� �ּҰ��̴� //
				// �׷��⿡ ���� ���� ������ �� ���ÿ��� �� == ����
				// �� �迭���� ���ÿ� ���� ���� �� ������ ���� ���� �տ��� ���� == ����
				// ������ ���� 0�� ���� ������ ������ �� �ݺ��� �����ؼ� ���� ���� �� ������ ����. ļ �ù�
				// ���� ���밡���� ���� ���밡����
				if(w<v)w=v;
			}
			s[++m]=i;
		}
		System.out.println(w);
	}
}