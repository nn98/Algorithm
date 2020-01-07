package BaekJoon;

public class P14405_4 {

	public static void main(String[] args) {
		String X=new java.util.Scanner(System.in).next();
		if(X.equals(""))System.out.print("NO");
		else {
			char[]a=X.toCharArray();
			try {
				for(int i=0;i<a.length-1;i++) {
					if(a[i]=='p'&&a[i+1]=='i') {
						i++;
					}else if(a[i]=='k'&&a[i+1]=='a') {
						i++;
					}else if(a[i]=='p'&&a[i+1]=='h'&&a[i+2]=='u') {
						i+=2;
					}else {
						System.out.print("NO");
						return;
					}
				}
			} catch(Exception e) {
				System.out.print("NO");
				return;
			}
		}
	}

}
