package BaekJoon.Simple_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P26711 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(reader.readLine());
        BigInteger b = new BigInteger(reader.readLine());
        System.out.printf(a.add(b).toString());
    }
}
