package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String t=s.nextLine().trim();
        if(t.compareTo("")==0) {
        	System.out.println("0");
        	return;
        }
        String[] r=t.split(" ");
        System.out.println(Arrays.deepToString(r)+r.length);
	}

}