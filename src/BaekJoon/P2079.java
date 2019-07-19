package BaekJoon;

public class P2079 {

	static boolean sol(String[] in) {
		for(int i=0;i<in.length/2;i++) {
			if(in[i].equals(in[in.length-(i+1)])) continue;
			else return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
