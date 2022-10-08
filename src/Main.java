import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //This allows us to see the output of our exercise1 function, feel free to modify this line to test out your code
        System.out.println(exercise1(9119));


        //This allows us to see the output of our exercise2 function, feel free to modify this line to test out your code
        System.out.println(Arrays.toString(exercise2(new long[]{1, 2, 3}, 2)));

        //This allows us to see the output of our exercise3 function, feel free to modify this line to test out your code
        System.out.println(exercise3("krishan"));


        //This allows us to see the output of our exercise4 function, feel free to modify this line to test out your code
        System.out.println(exercise4("Camillelleeaa"));

    }

    /*
    This function takes a number as argument and then should square every digit of your number,
    concatenate them and finally return the result.
    For example, if we run 9119 through the function, 811181 will come out, because 9 squared  is 81 and 1 squared is 1.
    Note: The function takes an integer and returns an integer*/
    public static int exercise1(int input_number) {

        String numberString = Integer.toString(input_number);
        StringBuilder result = new StringBuilder();
        int final_answer = 0;
        int rev_a = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            int a = (Integer.parseInt(String.valueOf(c)));
            rev_a = a*a;
            String revback = Integer.toString(rev_a);
            result.append(revback);
        }
        final_answer = Integer.parseInt(String.valueOf(result));
        return final_answer;
    }

    /*
    This function takes as arguments a list of numbers and a number multiplier. The function should return an array
    of longs with each number of the array multiplied by the number multiplier.
    For example: exercise2([1,2,3], 2) should return [2,4,6]
     */

    public static long[] exercise2(long[] numbers, int multiplier) {
        ArrayList<Long> result = new ArrayList<Long>();

        for (long number : numbers) {
            result.add(number * multiplier);
        }
        int n = result.size();
        long[] final_long_array = new long[n];
        for (int i = 0 ; i < n ; i++) {
            final_long_array[i] = result.get(i);
        }
        return final_long_array;
    }


    /*Given a string MyStr, reverse it and omit all non-alphabetic characters.
    * For MyStr = "krishan", the output should be "nahsirk".
    For MyStr = "ultr53o?n", the output should be "nortlu".*/
    public static String exercise3(String MyStr) {
        MyStr = MyStr.replaceAll("[^a-zA-Z]", "");
        StringBuilder reverse_string =new StringBuilder(MyStr);
        reverse_string.reverse();
        return reverse_string.toString();
    }

    /* From a string containing consecutive double letters, write a string that outputs the string with simple letters instead of double ones.
    Input: `Camillelleeaa`.
    Output: `"Camilelea"` ?*/
    public static String exercise4(String MyStr) {
        if(MyStr.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        char[] arr = MyStr.toCharArray();
        builder.append(arr[0]);
        for (int i = 1 ; i<MyStr.length() ; i++) {
            if (arr[i] != arr[i-1]){
                builder.append(arr[i]);
            }
        }
        return builder.toString(); //The type of your result should be a string
    }
}
