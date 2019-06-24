package BaekJoon;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		while(i<=10) {
			if(i==10) System.out.print(i);
			else System.out.print(i+"+");
			sum+=i;
			i++;
		}
		System.out.print("="+sum);
		char c=65;
		System.out.print(c);
		for(int h=0;h<26;h++) System.out.printf("%c",c+h);
	}

}
