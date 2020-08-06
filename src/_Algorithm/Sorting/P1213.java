package _Algorithm.Sorting;

public class P1213 {

	public static void main(String[] args) {
		int s=26,a[]=new int[s],i=0,j,x=0;
		for(char c:new java.util.Scanner(System.in).next().toCharArray())
			a[c-'A']++;
		for(;i<s;)
			if(a[i++]%2==1)
				if(x>0) {
					System.out.print("I'm Sorry Hansoo");
					return;
				}else x++;
	}

}
