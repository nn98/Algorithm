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
			if(s.equals(""))continue;
			f.append("\""+s+"\",");
			if(++i%5==0)f.append("\n");
		}
		f.replace(f.length()-1,f.length(),"]");
		System.out.println(f);
	}

}
/*
1반
["eoehd1ek","skhukdh","sub10","cion6339","sinaskim",
"samidg108","skyjm1023","kjh980214","junilg","rispend",
"ckswlszla123","asdz9908","msy7378","phs5145","vamos",
"qkrtnqja","cindy1078","smjsih","heejeong3394","anysong1",
"songjuhwan33","a26214165","impjs17","iyuna6577","dlwldbs8015@gmail.com",
"yjy5923","qwe916","reperfection","koreanwi","zoeyourlife",
"hahnsh64","3021062","hun5078"]
*/