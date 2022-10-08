import java.util.ArrayList;

public class indiv {
    public static void main(String[] args) {
        System.out.println(exercise2(new long[]{1, 2, 3}, 2));
    }
    public static ArrayList<Long> exercise2(long[] numbers, int multiplier) {
        ArrayList<Long> result = new ArrayList<Long>();
        for (long number : numbers) {
            result.add(number * multiplier);
        }
        return result;
    }
}
