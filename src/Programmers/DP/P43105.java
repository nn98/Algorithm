package Programmers.DP;


import java.util.Arrays;

public class P43105 {
    static int[][] arr,dp;
    static int n,i;
    static int o(int x,int y) {
        if (x==n-1) return dp[x][y];
        int left;
        if (dp[x+1][y]>arr[x+1][y]) left=dp[x+1][y];
        else left=o(x+1,y);
        int right;
        if(dp[x+1][y+1]>arr[x+1][y+1])right=dp[x+1][y+1];
        else right=o(x+1,y+1);
        return dp[x][y]+=Math.max(left,right);
    }
    static public int solution(int[][] triangle) {
        arr=triangle;
        n=triangle.length;
        dp=new int[n][];
        for(i=0;i<n;dp[i]=Arrays.copyOf(arr[i],arr[i].length),i++);
        return o(0,0);
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}}));
        for(int[]a:dp) System.out.println(Arrays.toString(a));
    }
}
