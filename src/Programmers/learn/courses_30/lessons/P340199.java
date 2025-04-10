package Programmers.learn.courses_30.lessons;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        if(wallet[0]<wallet[1]) s(wallet);
        if(bill[0]<bill[1]) s(bill);
        for(;;) {
            if(bill[0]<=wallet[0] && bill[1]<=wallet[1]) break;
            bill[0]/=2;
            if(bill[0]<bill[1]) s(bill);
            answer++;
        }
        return answer;
    }
    public void s(int[] a) {
        int t=a[0];
        a[0]=a[1];
        a[1]=t;
    }
}
