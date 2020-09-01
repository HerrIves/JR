package com.javarush.task.task18.task1827;

/* 
Прайсы
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length ==0){

        }else if (args[0].equals("-c"))
        {
            Product product = new Product();
            String fileName = null;

            ProductIn productInput = new ProductIn(args, product);

            BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
            fileName = readerFileName.readLine();
            readerFileName.close();

            ProductOut productOut = new ProductOut(product, fileName);

            FileWriter oSW = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(oSW);
            writer.newLine();
            writer.write(productOut.readyToWriteLine);
            writer.flush();
            writer.close();
            oSW.close();


        }
    }
}
