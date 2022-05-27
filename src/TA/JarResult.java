package TA;

import java.io.*;
import java.util.*;

public class JarResult {

    public static String execCmd(String cmd) {
	    try {
	        Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
	        BufferedReader reader = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));
	        String line = null;
	        StringBuffer sb = new StringBuffer();
	        sb.append(cmd);
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	            sb.append("\n");
	        }
	        return sb.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}
    public static void main(String[] args) {
	
	System.out.println(execCmd("dir"));

    }

}
