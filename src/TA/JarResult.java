package TA;

import java.io.*;
import java.util.*;

public class JarResult {

	static StringBuffer sb = new StringBuffer();
	static int flag;
    public static void execCmd(String cmd) {
	System.out.println(cmd);
	    try {
	        Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
	        BufferedReader reader = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));
	        String line = null;
	        
	        sb.append(cmd+"\n");
	        while ((line = reader.readLine()) != null) {
String[]arr=line.split("\\.");
		if(arr[arr.length-1].equals("jar")){
flag=1;
execCmd("java -jar "+line);
flag=0;
}
if(flag>0){
	            sb.append(line);
	            sb.append("\n");
}
	        }
	    } catch (Exception e) {
System.out.println("err");
	        e.printStackTrace();
	    }
	    return;
	}
    public static void main(String[] args) {
	System.out.println("Program is running...");
execCmd("dir /b/oe/on");
	System.out.println("Result: \n"+sb);

    }

}
