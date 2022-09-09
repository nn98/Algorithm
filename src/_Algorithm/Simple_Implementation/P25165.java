package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P25165 {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],i=0,j=s.nextInt()-1,r=s.nextInt(),p=0,x=0;
	a[s.nextInt()-1][s.nextInt()-1]++;
	for(;i<n&x<1;i++) {
	    if((i%2==0&r>0)|(i%2==1&r<1)) {
		for(;++j<m&x<1;x=i==n-1&j==m-1?1:0)if(a[i][j]>0)p++;
	    }
	    else for(;--j>=0&x<1;x=i==n-1&j==m-1?1:0)if(a[i][j]>0)p++;
	}
	System.out.println(p<1?"YES!":"NO...");
    }
}