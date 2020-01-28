package BaekJoon;

public class P10799 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int i=0,c=0,r=0;
		for(;i<a.length;i++) {
			if(a[i]=='(') {
				if(a[i+1]==')') {
					r+=c;
					i++;
				}
				else c++;
			}
			else c--;
		}
	}
}