package _Algorithm.String.KMP;
//System.out.println(String.format("i:%d %c\tj:%d %c\tk:%d",i+k,a[i+k],j+k,a[j+k],k)),
public class P1701 {

	public static void main(String[] args)throws Exception{
		char[]a=new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine().toCharArray();
		int i=0,j,n=0,r=0,k=0,l=a.length;
		for(;i<l;i++) {
			for(j=i+1;j<l;j++,r=k>r?k:r,n=0) {
				if(a[i]==a[j]) {
					for(k=1;i+k<l&j+k<l&n<1;n=a[i+k]==a[j+k]?0:1,k=n<1?k+1:k);
					i=j-1;
				}
			}
		}
		System.out.println(r);
	}

}

