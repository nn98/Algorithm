package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i=Integer.parseInt(b.readLine());
		for(; i>0; i--) {
            String[] temp = b.readLine().split(" ");
            bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
        }
		bw.flush();
	}

}
