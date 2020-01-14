package BaekJoon;

public class P3613 {

	public static void main(String[] args) {
		String n=new java.util.Scanner(System.in).next();
		int i=0;
		if(n.contains("__")||n.charAt(0)=='_'||n.charAt(n.length()-1)=='_'||n.charAt(0)<97)System.out.print("Error!");
		else {
			if(n.equals(n.toLowerCase())) {
				if(n.contains("_")) {
					for(;i<n.length();i++) {
						if(n.charAt(i)=='_')
							if(n.charAt(i+1)<97)System.out.print("Error!");
							else System.out.print((char)(n.charAt(++i)-32));
						else
							System.out.print((char)n.charAt(i));
					}
				}else {System.out.print(n);}
			}else {
				if(n.contains("_"))
					System.out.print("Error!");
				else {
					for(;i<n.length();i++) {
						if(n.charAt(i)<97)
							System.out.print('_'+""+(char)(n.charAt(i)+32));
						else
							System.out.print((char)n.charAt(i));
					}
				}
			}
		}
	}
}