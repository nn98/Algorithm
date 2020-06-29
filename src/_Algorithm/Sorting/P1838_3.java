package _Algorithm.Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1838_3 {

	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(R.readLine()),a[]=new int[n],i=0,b[]=new int[n],j,r=0;
		StringTokenizer t=new StringTokenizer(R.readLine());
		for(;i<n;b[i]=a[i++]=Integer.parseInt(t.nextToken()));
		Arrays.sort(a);
		for(i=0;i<n;i++)
			for(j=n;j-->0;)
				if(a[i]==b[j])
					r=r>j-i?r:j-i;

					System.out.println(r);
	}

}
