package BaekJoon;

public class P2023_2 {

	static int n=new java.util.Scanner(System.in).nextInt();
	
	static void o(String s,int l) {
		if(l==n)
			System.out.println(s);
		else {
			for(int i=0;i++<9;)
				if(p(Integer.parseInt(s+i)))
					o(s+i,l+1);
		}
	}
	
	static boolean p(int m) {
		if(m==1)return false;
		for(int i=(int)Math.sqrt(m);i>1;i--)
			if(m%i==0)return false;
		return true;
	}
	
	public static void main(String[] args) {
		o("",0)
;	}

}
