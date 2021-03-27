package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String>returnList = new ArrayList<>();
        Queue<File>queue = new ArrayDeque();

        queue.add(new File(root));

        while (!queue.isEmpty()){
            File file = queue.poll();
            for (File f:file.listFiles()) {
                if (f.isDirectory()){queue.add(f);
                }else returnList.add(f.getAbsolutePath());
            }
        }
        return returnList;

    }

    public static void main(String[] args) throws IOException {
        for (String s: getFileTree(args[0])
             ) {
            System.out.println(s);

        }

    }
}
