package Programmers.Simulation;

import java.util.Arrays;

public class P42842 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(10, 2)));
        System.out.println(Arrays.toString(new Solution().solution(8, 1)));
        System.out.println(Arrays.toString(new Solution().solution(24, 24)));
    }

    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] HV = {yellow, 1};
            System.out.println("sol: "+Arrays.toString(HV));
            int[] answer = getAns(brown, HV);
            answer[0] += 2;
            answer[1] += 2;
            return answer;
        }
        public int[] matchHV(int[] HV) {
            int yellow = HV[0]*HV[1];
            int newV = HV[1]+1;
            int newH = yellow/newV;
            for(int i=0 ; newH >= newV ; ) {
                if(yellow%newV==0) break;
                newV += 1;
                newH = yellow/newV;
            }
            HV[0]=newH;
            HV[1]=newV;
            System.out.println("newHV: "+Arrays.toString(HV));
            return HV;
        }
        public int getBrown(int[] HV) {
            int hor = (HV[0]+2)*2;
            int ver = HV[1]*2;
            System.out.println("\tbrown: "+(hor+ver));
            return hor+ver;
        }
        public int[] getAns(int brown, int[] HV) {
            for(;getBrown(HV)!=brown;) {
                HV=matchHV(HV);
            }
            return HV;
        }
    }

}
