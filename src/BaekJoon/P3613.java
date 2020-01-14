package BaekJoon;

public class P3613 {

	public static void main(String[] args) {
		String n=new java.util.Scanner(System.in).next();
		int i=0;
		if(n.equals(n.toLowerCase())) {
			if(n.contains("_")) {
				for(;i<n.length();i++) {
					if(n.charAt(i)=='_')
						System.out.print((char)(n.charAt(++i)-32));
					else
						System.out.print((char)n.charAt(i));
				}
			}else {System.out.print(n);}
		}else {
			for(;i<n.length();i++) {
				if(n.charAt(i)<97)
					System.out.print('_'+""+(char)(n.charAt(i)+32));
				else
					System.out.print((char)n.charAt(i));
			}
		}
	}

}
