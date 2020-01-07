package BaekJoon;

public class P14405_2 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		boolean c=true;
		if(a.length<2)c=false;
		for(int i=0;c&&i<a.length-1;i++) {
			if(a[i]=='p'&&a[i+1]=='i') i++;
			else if(a[i]=='k'&&a[i+1]=='a') i++;
			else if(i<a.length-2)if(a[i]=='c'&&a[i+1]=='h'&&a[i+2]=='u') i+=2;
			else c=false;
			else c=false;
		}
		System.out.print(c?"YES":"NO");
	}

}
