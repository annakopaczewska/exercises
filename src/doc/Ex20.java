package doc;

import java.util.ArrayList;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {

        int days[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {10, 19, 20, 10, 11, 139, 153, 10};

        List<Integer> result = findDaysWithLowestPrice(days, price);
        System.out.println(result);
    }

    public static List<Integer> findDaysWithLowestPrice(int[] days, int[] price){
        int lowestPrice = findLowestPrice(price);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < price.length; i++) {
            if (price[i] == lowestPrice) {
                int day = days[i];
                result.add(day);
            }
        }
        return result;
    }

    public static int findLowestPrice(int[] price){
        int lowestPrice = price[0];
        for (int i = 0; i < price.length; i++) {
            if (price[i] < lowestPrice) {
                lowestPrice = price[i];
            }
        }
        return lowestPrice;
    }
}
