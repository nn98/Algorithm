package Algorithm_Training;

import java.util.Scanner;

public class L_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String arr=s.nextLine();
		char[] arr1=arr.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>64&&arr1[i]<91) arr1[i]=(char) ('Z'-(arr1[i]-'A'));
			else if(arr1[i]>96&&arr1[i]<123) arr1[i]=(char) ('z'-(arr1[i]-'a'));

			System.out.print(arr1[i]);
		}
	}

}
