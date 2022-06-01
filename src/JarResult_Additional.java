package TA;

import java.io.*;
import java.util.*;

public class JarResult_Additional {

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
		if(arr[arr.length-1].equals("jar")){
		    flag=1;
		    execCmd("java -jar "+line);
		    flag=0;
		}
		if(flag>0){
		    sb.append(line+(i<1?"\tcode is "+(line.split(":")[0].trim().equals(code)?1:0):""));
		    sb.append("\n");
		}
		if(i<1){
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
	execCmd("dir /b/oe/on");
	System.out.println("\nResult code: \n\n"+sb);
	System.out.println("Result score: \n"+sbR+"\ncorrect: "+cor+"\nincorrect: "+incor);
    }

}