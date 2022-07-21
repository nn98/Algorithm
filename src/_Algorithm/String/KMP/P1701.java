package _Algorithm.String.KMP;

public class P1701 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int i=0,j,n=0,r=1,k=1,l=a.length,h[];
		for(;i<l;i++) {
			for(j=i+1;j<l;j++,r=k>r?k:r,n=0) {
				if(a[i]==a[j]) {
					for(k=1;i+k<l&j+k<l&n<1;n=a[i+k]==a[j+k++]?0:1,System.out.println(String.format("i:%d %c\tj:%d %c\tk:%d",i,a[i],j,a[j],k)));
				}
			}
		}
		System.out.println(r-1);
	}

}
