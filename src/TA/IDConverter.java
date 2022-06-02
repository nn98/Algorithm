package TA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IDConverter {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input ID_LIST. end by 0");
		int i=0;
		String s;
		StringBuffer f=new StringBuffer("[");
		while(!(s=r.readLine()).equals("0")) {
			f.append("\""+(s.equals("")?"itcantbetrueitsundifinezzzzzz":s)+"\",");
			if(++i%5==0)f.append("\n");
		}
		f.replace(i%5==0?f.length()-2:f.length()-1,f.length(),"]");
		System.out.println(f);
	}

}
/*
1반
["eoehd1ek","skhukdh","sub10","cion6339","sinaskim",
"samidg108","skyjm1023","kjh980214","junilg","rispend",
"ckswlszla123","asdz9908","msy7378","phs5145","vamos",
"itcantbetrueitsundifinezzzzzz","qkrtnqja","cindy1078","smjsih","heejeong3394",
"anysong1","songjuhwan33","a26214165","itcantbetrueitsundifinezzzzzz","impjs17",
"iyuna6577","dlwldbs8015@gmail.com","yjy5923","itcantbetrueitsundifinezzzzzz","qwe916",
"reperfection","koreanwi","itcantbetrueitsundifinezzzzzz","zoeyourlife","hahnsh64",
"3021062","hun5078"]
*/
/*
2반
["minjeong2904","minjune8506","kim97","tndusy27","kshyun419",
"jkkj0414","06zzkimzz06","rlaxogjs5656","haeunkim0807","hesy0147",
"201632006","hyk4238","a3920679","jinsu4755","eunseo5355",
"sonyejin6449","","20184120","hs980414","202014021",
"kuntek1953","lsh328328","201634015","leejh0702","szljs",
"dlaxodud1217","abcdeun","jiyoon","","vact19",
"joseeun0805","wnehdtjr5","hackin","jinseeun1127","dd0910",
"","gustn8523","gjwldud0719"]
*/