import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

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
        for(int i=0 ; i<numbers.length ; i++){
            result.add(numbers[i]*multiplier);
        }
        System.out.println(result);
        //System.out.println(String.toSting(numbers));
        //System.out.println(multiplier);

        return result; //The type of your result should be an array of longs
    }


    /*Given a string MyStr, reverse it and omit all non-alphabetic characters.
    * For MyStr = "krishan", the output should be "nahsirk".
    For MyStr = "ultr53o?n", the output should be "nortlu".*/
    public static String exercise3(String MyStr) {

        //System.out.println(MyStr);
        return result; //The type of your result should be a String
    }

    /* From a string containing consecutive double letters, write a string that outputs the string with simple letters instead of double ones.
    Input: `Camillelleeaa`.
    Output: `"Camilelea"` ?*/
    public static String exercise4(String MyStr) {
        String result = "";
        for (int i = 0 ; i<MyStr.length() ; ++i) {
            if (MyStr[i] != MyStr[i+1]){
                result = result + MyStr[i];
            } else {
                continue;
            }

        }
        //Your code here
        System.out.println(MyStr);
        return result; //The type of your result should be a string
    }


}
