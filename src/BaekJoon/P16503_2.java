package BaekJoon;

public class P16503_2 {
	static int a[]=new int[3],i=0,j=0,m=0;
	static String[]b=new String[2];
	static int o(int p,int q,int c) {
		switch(b[c]) {
		case "+":
			c=p+q;
			break;
		case "-":
			c=p-q;
			break;
		case "*":
			c=p*q;
			break;
		case "/":
			c=p/q;
			break;
		}
//		System.out.println(p+" "+q+" "+c);
		return c;
	}
	public static void main(String[] args) {
		for(String s:new java.util.Scanner(System.in).nextLine().split(" ")) {
			if(i%2==0)a[j++]=Integer.parseInt(s);
			else b[m++]=s;
			i++;
		}
		i=o(a[0],o(a[1],a[2],1),0);
		j=o(o(a[0],a[1],0),a[2],1);
		System.out.print(i<j?i+"\n"+j:j+"\n"+i);
	}
}