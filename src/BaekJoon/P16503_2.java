package BaekJoon;

public class P16503_2 {
	static int a[]=new int[3],i=0,j=0,m=0;
	static String[]b=new String[2];
	public static void main(String[] args) {
		for(String s:new java.util.Scanner(System.in).nextLine().split(" ")) {
			if(i%2==0)a[j++]=Integer.parseInt(s);
			else b[m++]=s;
			i++;
		}
		for(;j-->0;) {
			switch(b[--m]) {
			case "+":
				
				break;
			case "-":
				
				break;
			case "*":
				
				break;
			case "/":
				
				break;
			}
		}
	}
}