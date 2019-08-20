import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(t.nextToken()),m=Integer.parseInt(t.nextToken());
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> brr=new ArrayList<String>();
		
		if(n<=m) {
			for(int i=0;i<n;i++) arr.add(bf.readLine());
			Collections.sort(arr);
			String[]temp=new String[arr.size()];
			temp=arr.toArray(temp);
			for(int i=0;i<m;i++){
				String s=bf.readLine();
				int idx=Arrays.binarySearch(temp, s);
				if(idx>=0){
					brr.add(s);
				}
			}
//			Collections.sort(arr);
//			for(int i=0;i<m;i++) brr.add(bf.readLine());
//			Collections.sort(brr);
		}
		else {
			for(int i=0;i<m;i++) arr.add(bf.readLine());
			Collections.sort(arr);
			String[]temp=new String[arr.size()];
			temp=arr.toArray(temp);
			for(int i=0;i<n;i++){
				String s=bf.readLine();
				int idx=Arrays.binarySearch(temp, s);
				if(idx>=0){
					brr.add(s);
				}
			}
//			for(int i=0;i<m;i++) arr.add(bf.readLine());
//			Collections.sort(arr);
//			for(int i=0;i<n;i++) brr.add(bf.readLine());
//			Collections.sort(brr);
		}
//		brr.retainAll(arr);
		Collections.sort(brr);
		System.out.println(brr.size());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//¼±¾ð
		for(String i:brr) bw.write(i+"\n");
		bw.flush();
	}
}
