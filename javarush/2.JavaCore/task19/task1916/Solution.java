package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1 = null;
        String file2 = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {            e.printStackTrace();        }

        try(BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))){
            while (fileReader.ready()){
                lines.add(new LineItem(Type.REMOVED, fileReader.readLine()));
            }
        }

        String file2Line = null;
        try(BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)))){
            while (reader2.ready()){
                file2Line = reader2.readLine();
                for (LineItem item:lines                     ) {
                    if (item.line.equals(file2Line)){
                        item.type = Type.SAME;
                    }else lines.add(new LineItem(Type.ADDED, file2Line));
                }
            }
        }

        for (LineItem item:lines) {
            System.out.println(item);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return this.type+" "+this.line;
        }
    }


}
