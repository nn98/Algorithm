package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1874_2_A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr=new int[Integer.parseInt(br.readLine())];
		int[] brr=new int[arr.length];
		Arrays.fill(brr, -1);
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
//			brr[i]=i+1;
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(brr));
		int i=0,c=0;
		while(true) {
			System.out.println("i: "+i+" c: "+c);
			if(c==arr.length) break;
			if(i<0||i>=arr.length) {
				bw=new BufferedWriter(new OutputStreamWriter(System.out));
				bw.write("NO");
				break;
			}
			if(brr[i]<arr[c]) {
				if(i==0&&c==0) bw.write("+\n");
				if(brr[i]==0) {
					if(i==0) bw.write("+\n");
				}
				i++;
			}
			else if(brr[i]==arr[c]) {
				if(i==0&&c==0) bw.write("+\n");
				bw.write("-\n");
				c++;
				brr[i]=0;
				while(brr[i]==0&&i>0) i--;
			}
			else if(brr[i]>arr[c]) {
				bw=new BufferedWriter(new OutputStreamWriter(System.out));
				bw.write("NO");
				break;
			}
		}
		bw.flush();
	}

}
