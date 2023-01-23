package BaekJoon.Greedy;
// ������� �������� ��ǥ�� ������
import java.io.*;
import java.util.*;
public class P4796 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=0,i;
		for(;;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			long a[]=new long[6];
			for(i=0;i<3;a[i++]=Integer.parseInt(t.nextToken()));
			if(a[0]<1)break;
			for(;a[2]>=a[4]+a[1];a[4]+=a[1],a[3]++);
			a[5]=a[2]-a[4];
//			System.out.println(Arrays.toString(a));
			w.write("Case "+(++n)+": "+(a[0]*a[3]+(a[5]<a[0]?a[5]:a[0]))+"\n");
		}
		w.flush();
	}
}