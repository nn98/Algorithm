package BaekJoon;
public class P2164 {
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt(),c=1,i=0;
		boolean[]a=new boolean[n];
		while(c<n){
			if(!a[i%n]){
				a[i%n]=true;
				c++;
				while(a[++i%n]);
			}
			i++;
		}
		for(int j=0;j<n;j++)if(!a[j])System.out.print(j+1);
	}
}