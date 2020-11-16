package com.javarush.task.task19.task1918;                                                  
                                                  
import java.io.BufferedReader;                                                  
import java.io.FileReader;                                                  
import java.io.IOException;                                                  
import java.io.InputStreamReader;                                                  
import java.util.ArrayList;                                                  
                                                  
/*                                                   
Знакомство с тегами                                                  
*/                                                  
                                                  
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = null;
        System.out.println(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);

        while (fileReader.ready()){
            char currentChar = (char) fileReader.read();
            if (currentChar == '<'){
                System.out.println(readTeg(fileReader, args[0], currentChar));
            }
        }
    }

    public static String readTeg(FileReader fileReader, String args, char currentChar) throws IOException {
        StringBuilder tegBuilder = new StringBuilder();

        while (fileReader.ready()) {
            String currentTeg = "";
            char lastChar = currentChar;
            currentTeg = currentTeg + currentChar;

            for (int i = 0; i < args.length(); i++) {                                                          // prufen args
                currentTeg = currentTeg + (char) fileReader.read();
            }if (!currentTeg.equals('<' + args)) {
                    break;
            }

            while (fileReader.ready()) {                                                                    //read weiter

                currentChar = (char) fileReader.read();
                currentTeg = currentTeg + currentChar;

                if (currentChar == '/' && lastChar == '<') {                                                //look for end teg
                    while (fileReader.ready()) {
                        if (currentChar == '>') {
                            return tegBuilder.append(currentTeg).toString();
                        }
                        currentChar = (char) fileReader.read();
                        currentTeg = currentTeg + currentChar;
                    }
                }

                if (currentChar == '<') { //recursion
                    String tempTeg = "";
                    for (int i = 0; i < args.length(); i++) {       //
                        tempTeg = tempTeg + (char) fileReader.read();
                    }
                    if (tempTeg.equals(args)) {
                        currentTeg = currentTeg + tempTeg + readTeg(fileReader, args, currentChar);
                    }
                }
            }

                tegBuilder.append(currentTeg);
            }
            return tegBuilder.toString();
        }
    }