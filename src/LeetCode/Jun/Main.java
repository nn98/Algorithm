package LeetCode.Jun;

import java.io.*;
import java.awt.*;

public class Main {

	public static void main(String[] args)throws Exception{
//		Clipboard test 1. Fail --textArea?--
//		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
//		String c=textArea.getSelectedText();
//		if(c!=null) {
//			StringSelection con=new StringSelection(c);
//			clip.setContents(con,null);
//		}

//		Clipboard test 2. Fail --txtCommand?--
//		String ctc = txtCommand.getText().toString();
//	    StringSelection stringSelection = new StringSelection(ctc);
//	    Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
//	    clpbrd.setContents(stringSelection, null);
		
//		Clipboard test 2. Success --상위 케이스들은 해당 변수에 텍스트를 설정하고 그 텍스트를 클립보드로 복사하는듯.--
//		String myString = "This text will be copied into clipboard";
//		StringSelection stringSelection = new StringSelection(myString);
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clipboard.setContents(stringSelection, null);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("2020-06\t1. TwoSum");
		
	}

}
