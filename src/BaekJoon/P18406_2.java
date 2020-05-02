package BaekJoon;
public class P18406_2{
	public static void main(String[]z) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int n=0,m=a.length-1,i=0,j=0;
		for(;n<m;i+=a[n++]-'0',j+=a[m--]-'0');
		System.out.print(i==j?"LUCKY":"READY");
	}
}