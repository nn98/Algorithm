package _Algorithm.Simple_Implementation;

import java.io.UnsupportedEncodingException;

public class P11283 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String word = "무궁화 꽃이 피었습니다.";

		System.out.println("utf-8 -> euc-kr        : " + new String(word.getBytes("utf-8"), "euc-kr"));
	}

}
