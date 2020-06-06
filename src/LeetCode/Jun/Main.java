package LeetCode.Jun;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Main {

	public static void main(String[] args) {
//		Clipboard test 1. --textArea?--
//		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
//		String c=textArea.getSelectedText();
//		if(c!=null) {
//			StringSelection con=new StringSelection(c);
//			clip.setContents(con,null);
//		}

//		Clipboard test 2. --txtCommand?--
//		String ctc = txtCommand.getText().toString();
//	    StringSelection stringSelection = new StringSelection(ctc);
//	    Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
//	    clpbrd.setContents(stringSelection, null);
		
		String myString = "This text will be copied into clipboard";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}

}
