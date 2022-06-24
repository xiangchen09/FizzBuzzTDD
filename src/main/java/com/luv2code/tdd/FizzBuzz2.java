package com.luv2code.tdd;

public class FizzBuzz2 {

    public static String compute(int num) {

        StringBuilder sb = new StringBuilder();

        if (num % 3 == 0) {
            sb.append("Fizz");
        }

        if (num % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.isEmpty()) {
            sb.append(num);
        }

        return sb.toString();

    }
//        if (num % 3 == 0 && num % 5 == 0) {
//            return "FizzBuzz";
//        }
//        else if (num % 3 == 0) {
//            return "Fizz";
//        }
//        else if (num % 5 == 0) {
//            return "Buzz";
//        }
//
//        return Integer.toString(num);
//    }
}
