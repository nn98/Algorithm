package BaekJoon._Before_Tagging;

public class P12755_3 {
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j=9,v,c;
		for(;i*j<n;i++,j*=10);
//		System.out.println(i+" "+j);
		i--;
		j/=10;
		n-=i*j;
//		System.out.println(n+" "+i+" "+j);
		v=(int) Math.pow(10, i++);
//		System.out.println(v);
		for(;n>i;n-=i,v++);
//		System.out.println(n+" "+v);
		System.out.println((""+v).charAt(n-1));
	}
}