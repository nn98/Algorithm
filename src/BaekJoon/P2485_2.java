package BaekJoon;

public class P2485_2 {

	static int G(int a,int b){
		for(;;) {
			int c=a%b;
			if(c==0)return b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		System.out.println(G(6,36));
	}

}
