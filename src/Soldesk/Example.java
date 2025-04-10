package Soldesk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Example {
    static void printInput(String inputType) {
        String msg = "";
        switch (inputType) {
            case "integer":
                msg = "Input an integer: ";
                break;
            case "real":
                msg = "Input a real number: ";
                break;
            case "sign":
                msg = "Input a sign: ";
                break;
            case "string":
                msg = "Input a string: ";
                break;
            case "line":
                msg = "Input a line: ";
                break;
            default:
                msg = "Input number of example: ";
        }
        System.out.print(msg);
    }
    static String inputLine(BufferedReader reader, String inputType){
        printInput(inputType);
        while (true) {
            try {
                return reader.readLine();
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage() + "\nTry again");
            }
        }
    }
    static void showExampleParamsByName(String exampleNumber) {
        try {
            Method method = Example.class.getDeclaredMethod("example"+exampleNumber, BufferedReader.class);
//            System.out.println(method);
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("매개변수 타입: " + parameter.getType().getName());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    static void runExampleByName(String exampleNumber, BufferedReader reader) {
        try {
            Method method = Example.class.getDeclaredMethod("example"+exampleNumber, BufferedReader.class);
//            System.out.println(method);
            method.invoke(new Example(), reader);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    void example05(BufferedReader reader) {
        int value = Integer.parseInt(inputLine(reader, "integer"));
        System.out.println(value>0?"Positive":value<0?"Negative":"Zero");
    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exampleNumber = inputLine(reader, "");
        showExampleParamsByName(exampleNumber);
//        String exampleParam = inputLine(reader, "line");
        runExampleByName(exampleNumber, reader);
    }
}
