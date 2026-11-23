package Programmers.Data_Structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P42578 {

    public static int solution(String[][] clothes) {
        Map<String, Integer> kindCount = new HashMap<>();
        for (String[] cloth : clothes) {
            String name = cloth[0];
            String kind = cloth[1];
            kindCount.merge(kind, 1, Integer::sum);
        }
        int count = 1;
        for (Entry<String, Integer> entry : kindCount.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
            count *= (entry.getValue() + 1);
        }
        return count - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(solution(new String[][]{
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}
