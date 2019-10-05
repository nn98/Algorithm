package BaekJoon;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.MAX_VALUE;
		System.out.println(n);
		int k=2;
//		int i=0;
//		for(;n>1;n/=2)i++;
//		System.out.println(n+" "+i);
		for(int i=1;i<31;i++) {
			System.out.println(i+"\t"+k);
			k*=2;
		}
		int c=1,op=1;
		for(int i=200000000;i>1;i/=2) {
			if(i%2==1) {
				i++;
				op+=2;
			}
			op++;
			System.out.println(c+++"\t"+i+"\t"+op);
			
		}
	}

}
