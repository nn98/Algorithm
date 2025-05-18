// 구현, 페이지 뒤로가기 기록 오타주의
package Coding_Test.K-Job_STAR_Seoul.Test_2025-05-15;
import java.io.*;
import java.util.*;
// 검토가 중요하다
public class Problem3 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");
        //   String[] history = new String[n];
        List<String> history = new ArrayList();
        //   history.add("5");
        //   history.add("1");
        //   history.add("8");
        //   history.add("15");
        //   history.remove(2);
        //   System.out.println(history.lastIndexOf("8"));

        int nowIndex=0;
        int nowHistory=0;
        int ans = 0;
        while(nowIndex < n) {
            if(history.contains(arr[nowIndex])) {
                int removeUntil = history.lastIndexOf(arr[nowIndex]);
                ans += history.size()-removeUntil-1;
                for(int i=history.size()-1;i>removeUntil;i-=1) {
                    //   System.out.println("now : "+i+" history : "+history+" arr[nowIndex] : "+history.indexOf(arr[nowIndex]));
                    history.remove(i);
                }
            } else {
                history.add(arr[nowIndex]);
                ans += t;
            }
            nowIndex += 1;
        }
        System.out.println(ans);
    }
}
/*
10 10
1 2 4 2 4 6 8 6 4 2
결과를 몰라요잉
*/
