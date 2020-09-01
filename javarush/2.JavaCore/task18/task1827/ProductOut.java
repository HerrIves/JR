package com.javarush.task.task18.task1827;

import java.io.*;

public class ProductOut {
    Product product;
    String fileName;
    String readyToWriteLine;

    public ProductOut(Product product, String fileName) throws IOException {
        this.product = product;
        this.fileName = fileName;
        product.setId(fileLastId(this.fileName) + 1);
        readyToWriteLine = addToOutLine(8, String.valueOf(product.getId()))              //private int id; //8
                         + addToOutLine(30, product.getProductName())                    //private String productName; //30
                         + addToOutLine(8, String.valueOf(product.getPrice()))           //private float price; //8
                         + addToOutLine(4, String.valueOf(product.getQuantity()));       //private int quantity; //4

        new FileInputStream(this.fileName).close();
    }

    public int fileLastId(String fileName) throws IOException {
        int maxId = 0;

        try(FileReader fIS = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fIS);){
            while (reader.ready()) {
                String currLine = reader.readLine();

                String currIdString = currLine.substring(0, 8);
                currIdString = currIdString.trim();
                int currId = Integer.parseInt(currIdString);

                maxId = currId>maxId?currId:maxId;
            }
            fIS.close();
            reader.close();
        }
        new FileInputStream(this.fileName).close();

        return maxId;
    }

    String addToOutLine(int cellNumb, String field) {
        char[] cells = new char[cellNumb];
        char[]fieldArr = field.toCharArray();

        for (int i = 0; i < cellNumb; i++) {
            cells[i] = ' ';
        }

        int fielCount = (cellNumb<fieldArr.length?cellNumb:fieldArr.length);
        for (int i = 0; i < fielCount; i++) {
                cells[i] = fieldArr[i];
            }

        return new String(cells);
    }
}
