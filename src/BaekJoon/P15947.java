package BaekJoon;

public class P15947 {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt()-1,c;
		String r="ru",a[]="baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" "),b=a[n%14];
		if(b.contains("tu")) {
			c=b.length()/2+n/14;
			b="tu";
			if(c>5) {
				b+="+ru*"+--c;
			}
			else for(;--c>0;b+="ru");
		}
		System.out.print(b);
	}
}