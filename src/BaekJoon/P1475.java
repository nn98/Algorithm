package BaekJoon;

//import java.util.Arrays;
import java.util.Scanner;

public class P1475 {

	// ¾î·Æ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char[] N=(""+n).toCharArray();
		int[] arr=new int[10];
		for(char i:N) {
			char c='0';
			for(int j=0;j<10;j++) {
				if(i==c+j) arr[j]++;
			}
		}
		//System.out.println(Arrays.toString(arr));
		int r=0;
		boolean Empty=true,six=false,nine=false;
		for(;;r++) {
			Empty=true;
			six=false;
			nine=false;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					Empty=false;
					if(i==6) six=true;
					if(i==9) nine=true;
					arr[i]--;
				}
			}
			if(Empty) break;
			if(arr[6]==0&&arr[9]!=0&&!six) arr[9]--;
			if(arr[9]==0&&arr[6]!=0&&!nine) arr[6]--;
			//System.out.println(Empty+Arrays.toString(arr));
		}
		System.out.println(r);
	}

}
