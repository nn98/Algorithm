package BaekJoon;

public class P15904{
	public static void main(String[] args) {
		String s=new java.util.Scanner(System.in).nextLine(),p;
		boolean[]a=new boolean[4];
		int i=0,j=0;
		for(;i<s.length();i++) {
			switch(j) {
			case 0:
				if(s.charAt(i)=='U')
					a[j++]=true;
				break;
			case 1:
				if(s.charAt(i)=='C')
					a[j++]=true;
				break;
			case 2:
				if(s.charAt(i)=='P')
					a[j++]=true;
				break;
			case 3:
				if(s.charAt(i)=='C')
					a[j++]=true;
				break;
			}
		}
		if(a[0]&&a[1]&&a[2]&&a[3])p="love";
		else p="hate";
		System.out.print("I "+p+" UCPC");
	}
}