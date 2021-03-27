package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {
    double median;

    public static void main(String[] args) {
        Integer[]array = new Integer[]{11, 3, 122, 36, 18,0,1};
        sort(array);
        for (Integer i: array) {
            //System.out.println(i);
        }



    }

    public static Integer[] sort(Integer[] array) {
        Solution solution = new Solution();

        Arrays.sort(array);

        if (array.length % 2 != 0) {
            solution.median = array[array.length / 2 ];
        }else {
            solution.median =
                    (array[array.length / 2 - 1])
                  +
                    (array[array.length / 2]);
            solution.median = solution.median/2;
        }
        //System.out.println("median: " + solution.median);

        Arrays.sort(array, solution.comparator);

            return array;
        }


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double difO1 = (Math.abs(median - o1));
                double difO2 = (Math.abs(median - o2));
                return (int)(difO1 - difO2);
            }
        };
    }
