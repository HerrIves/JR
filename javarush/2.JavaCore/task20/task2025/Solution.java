package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/
public class Solution {

    public static long[] getNumbers(long N) {
        if (N <= 0)return null;
        if (N>Long.MAX_VALUE)return null;

        ArrayList<Long> aList = new ArrayList<Long>();
        long result = 0;
        long[]degrees = new long[]{0,1,2,3,4,5,6,7,8,9,1};

        for (long currentN =1; currentN < N; currentN++){
            result = getCurrentNumber(currentN, degrees);

            if (result == currentN){
                aList.add(result);
            }
        }

        long[]resultArr = new long[aList.size()];
        for (int i = 0; i <aList.size() ; i++) {
            resultArr[i] = (long)aList.toArray()[i];
        }
        return resultArr;
    }

    public static long getCurrentNumber(long N, long[]degrees){
        long currentN = N;
        long nLenght = (long) (Math.log10(currentN)+1);
        if (nLenght > degrees[10]){
            for (int i = 0; i <10 ; i++) {
                degrees[i] *=i;
            }
            degrees[10]++;
        }
        double currentResult = 0.0;

        while (currentN != 0) {
            currentResult += degrees[(int)(currentN%10)];
            //System.out.println(currentN+" "+currentN%10+" "+degrees[(int)currentN%10]);
            currentN = currentN/10;
            if (currentResult > N) break;
        }
        return (long) currentResult;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

//        a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(1_000_000_000)));
//        b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);


//        for (long l: getNumbers(380)
//             ) {
//            System.out.print(l+" ");
//            }

        //        System.out.println(Long.MAX_VALUE);

    }
}
