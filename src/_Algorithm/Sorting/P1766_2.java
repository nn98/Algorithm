package _Algorithm.Sorting;
//Memory over
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1766_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),i=0,j;
		List<Integer>[]a=new List[n];
		for(;++i<n;a[i]=new ArrayList());
		for(;m-->0;) {
			i=s.nextInt();
			j=s.nextInt();
			a[j].add(i);
		}
//		for(List L:a)System.out.println(L);
		m=n;
		for(;m>1;) {
			boolean C=true,D;
			for(i=0;++i<n&&C;C=!a[i].isEmpty());
			if(!C)i--;
//				D=true;
//				for(j=0;++j<n&&D;D=a[i][j]==0);
//				C=D;
			System.out.print(i+" ");
			for(j=0;++j<n;)if(a[j].contains(i))a[j].remove((Integer)i);
			a[i].add(-1);
			m--;
		}
	}

}