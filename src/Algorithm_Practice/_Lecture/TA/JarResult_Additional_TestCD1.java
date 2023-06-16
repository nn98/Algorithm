package Algorithm_Practice._School.TA;

import java.io.*;
import java.util.*;

public class JarResult_Additional_TestCD1 {

    static StringBuffer sb = new StringBuffer(),sbR=new StringBuffer();
    static String code;
    static int flag,option,cor,incor;
    public static void execCmd(String cmd) {
	System.out.println(cmd);
	try {
	    Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
	    BufferedReader reader = new BufferedReader(
		    new InputStreamReader(process.getInputStream()));
	    String line = null;
	    sb.append(option<1?cmd+"\n\n":"");
	    int i=0;
	    while ((line = reader.readLine()) != null) {
		String[]arr=line.split("\\.");
	    flag=1;
		if(arr[arr.length-1].equals("jar")){
		    execCmd("java -jar "+line);
		}
		if(flag>0){
		    sb.append(line+(i<1?"\tcode is "+(line.split(":")[0].trim().equals(code)?1:0):""));
		    sb.append("\n");
		}
		if(i<1&flag>0){
			sbR.append("0\n");
			cor++;
		}
		i++;
	    }
	    if(i<1){
		sb.append("line is empty. might error.\n");
		sbR.append("1\n");
		incor++;
	}
	    sb.append(flag>0?"\n":"");
	} catch (Exception e) {
	    System.out.println("err");
	    e.printStackTrace();
	}
	return;
    }
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Input code: ");
	code=s.nextLine();
	System.out.print("Input option(0-all 1-only result: ");
	option=s.nextInt();
	System.out.println("Program is running...");
	execCmd("cd \"C:\\Users\\nn\\OneDrive - 성공회대학교\\Algorithm_Practice._School.TA\\22_1학기\\_자료구조\\[2022-1학기-자료구조-01][hw11_1]정렬\" & java -jar 16.[박태현-201813036]hw11_1-1.jar\n"
			+ "10\n"
			+ "201899011\n"
			+ "201988011\n"
			+ "202077022\n"
			+ "201988022\n"
			+ "202099022\n"
			+ "202176123\n"
			+ "201876125\n"
			+ "202077001\n"
			+ "9599002\n"
			+ "201988010\n"
			+ "");
	System.out.println("\nResult code: \n\n"+sb);
	System.out.println("Result score: \n"+sbR+"\ncorrect: "+cor+"\nincorrect: "+incor);
    }

}