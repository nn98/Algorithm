package BaekJoon;

public class P10769 {

	public static void main(String[] args) {
		String[]a=new java.util.Scanner(System.in).next().split("");
		int i=0,h=0,s=0;
		for(;i<a.length;i++)
			if(a[i].equals(":")&&a[i+1].equals("-"))
				if(a[i+2].equals(")"))h++;
				else if(a[i+2].equals(")"))s++;
		System.out.print((h==0&&s==0)?"none":(h==s?"unsure":(h>s?"happy":"sad")));
	}
}