package BaekJoon._Before_Tagging;
import java.util.*;
public class P2294{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],b[]=new int[m+1],i=0,j;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.fill(b,10001);
		b[0]=0;
		for(i=0;i<n;i++)
			for(j=a[i];j<=m;j++)b[j]=b[j-a[i]]+1<b[j]?b[j-a[i]]+1:b[j];
		System.out.println(b[m]==10001?-1:b[m]);
	}
}