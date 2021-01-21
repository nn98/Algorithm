package _Algorithm.DP;

//https://krockseed.tistory.com/1

import java.util.Scanner;

public class P19622 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		long a[][]=new long[n+2][3],d[][]=new long[1000001][2];
//		a 길이를 n+1로하면 인덱스 에러
//		??
		
//		for(;i++<n;a[i][0]=s.nextInt(),a[i][1]=s.nextInt(),a[i][2]=s.nextInt());
//		회의 시작/끝 시간은 필요도 없고 가중치만
		for(;i++<n;s.next(),s.next(),a[i][2]=s.nextInt());
		
		d[1][1]=a[1][2];
		d[2][1]=a[2][2];
		d[2][0]=a[1][2];
//		dp 배열 
		for(i=0;i++<n;d[i][0]=Math.max(d[i-1][0],d[i-1][1]),d[i][1]=d[i-1][0]+a[i][2]);
		
//		이번 회의에 참여하지 않았다면, 전 회의에 참여한 것과, 참여하지 않은 것의 최댓값을 가져오고,
//
//		이번 회의에 참여했다면, 전 회의에는 참여하지 못하니 d[i-1][0] 에 현재 값을 더해준다.
		System.out.println(Math.max(d[n][0],d[n][1]));
	}

}
