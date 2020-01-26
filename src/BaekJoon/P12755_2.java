package BaekJoon;
//https://joonas.tistory.com/45
public class P12755_2 {
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j=9,v=0,c=0,f=1,x=0,y;
		for(;v<n;i++,c=v,v+=i*j,j*=10);
		for(;x<i-1;x++)f*=10;
		y=n-c-1;
		System.out.print((""+(f+(x/i))).charAt(x%i));
	}
}
