package BaekJoon;

public class P3028 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int r=1;
		for(char i:a) {
			switch(i) {
			case 'A':
				switch(r) {
				case 1:
					r=2;
					break;
				case 2:
					r=1;
					break;
				}
				break;
			case 'B':
				switch(r) {
				case 2:
					r=3;
					break;
				case 3:
					r=2;
					break;
				}
				break;
			case 'C':
				switch(r) {
				case 1:
					r=3;
					break;
				case 3:
					r=1;
					break;
				}
				break;
			}
		}
		System.out.print(r);
	}

}
