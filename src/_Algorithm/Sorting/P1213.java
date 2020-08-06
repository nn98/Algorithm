package _Algorithm.Sorting;

public class P1213 {

	public static void main(String[] args) {
		int s=26,a[]=new int[s],i=0,j,x=0,y=0;
		StringBuffer f=new StringBuffer();
		for(char c:new java.util.Scanner(System.in).next().toCharArray())
			a[c-'A']++;
		for(;i<s;)
			if(a[i++]%2==1)
				if(x>0) {
					System.out.print("I'm Sorry Hansoo");
					return;
				}else {
					x++;
					y=i-1;
				}
		for(i=0;i<s;i++)
			if(a[i]%2==0)for(j=a[i]/2;j-->0;f.append((char)('A'+i)));
			else for(j=a[i]/2;j-->0;f.append((char)('A'+i)));
		System.out.print(""+f+(x==1?(char)('A'+y):"")+f.reverse());
	}

}
