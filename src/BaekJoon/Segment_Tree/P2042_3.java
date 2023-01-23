package BaekJoon.Segment_Tree;
//�ȴٰ� �̰�? �ù�?
//�� �Ǵµ� �Ƥ���
import java.util.Scanner;
public class P2042_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k,a[]=new int[n],i=0,b,c;s.next();k=s.nextInt();
		for(;i<n;a[i++]=s.nextInt());
		for(;k-->0;) {
			long r=0;
			while(true) {
				i=s.nextInt();
				b=s.nextInt();
				c=s.nextInt();
				a[b-1]=i==1?c:a[b-1];
				if(i==2) {
					for(i=b-1;i<c;r+=a[i++]);
					break;
				}
			}
			System.out.println(r);
		}
	}
}