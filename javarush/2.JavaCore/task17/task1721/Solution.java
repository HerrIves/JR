package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution s = new Solution();
        readData();
        try {
            s.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
        for (String ss :allLines             ) {
            System.out.println(ss);
        }
    }

    public static void readData(){
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = null;
        String path2 = null;
        {
            try {
                path1 = reader.readLine();
                path2 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }//read paths

        FileInputStream filePath = null;
        try {                                           //first file
            filePath = new FileInputStream(path1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(filePath));
        try{
            String line = reader.readLine();
            while(line!=null){
                //System.out.println(line);
                allLines.add(line);
                line = reader.readLine();
            }
        }catch (IOException e){e.printStackTrace();}

        try {                                           //second file
            filePath = new FileInputStream(path2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        reader = new BufferedReader(new InputStreamReader(filePath));
        try{
            String line = reader.readLine();
            while(line!=null){
                //System.out.println(line);
                forRemoveLines.add(line);
                line = reader.readLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {try {reader.close();
        } catch (IOException e) {e.printStackTrace(); }
        }

    }

    public void joinData() throws CorruptedDataException {
        int compareNumb = 0;
        for (int i = 0; i <forRemoveLines.size(); i++) {
            //System.out.println(forRemoveLines.get(i));
            for (int j = 0; j < allLines.size(); j++) {
                //System.out.println(allLines.get(j));
                if(forRemoveLines.get(i).equals(allLines.get(j))){
                    compareNumb++;
                    //System.out.println(compareNumb);
                    break;
                }
            }
        }
        if (compareNumb == forRemoveLines.size()){
            for (int i = 0; i <forRemoveLines.size(); i++) {
                //System.out.println(forRemoveLines.get(i));
                for (int j = 0; j < allLines.size() ;) {
                    //System.out.println(allLines.get(j));
                    if(forRemoveLines.get(i).equals(allLines.get(j))){
                        allLines.remove(j);
                    }else j++;
                }
            }

        }else{ allLines.removeAll(allLines); throw new CorruptedDataException();}

    }

}
