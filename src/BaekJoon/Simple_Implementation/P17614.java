package BaekJoon.Simple_Implementation;
public class P17614 {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),r=0;
		for(;n>2;n--)for(char c:String.valueOf(n).toCharArray())if(c=='3'|c=='6'|c=='9')r++;
		System.out.println(r);
	}
}