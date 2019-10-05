package BaekJoon;

public class P2447_4 {
	public static void main(String args[]) {
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			StringBuffer sb=new StringBuffer(n);
			for(int j=0;j<n;j++){
				boolean x=false;
				for(int l=1;l<n;l*=3) 
					if(i/l%3==1&&j/l%3==1)x=true;
				sb.append(x?" ":"*");
			}
			System.out.println(sb);
		}
	}
}