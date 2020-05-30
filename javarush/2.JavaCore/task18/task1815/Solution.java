package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tI;
        public TableInterfaceWrapper(TableInterface tI){
            this.tI = tI; {
            }
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tI.setModel(rows);

        }


        @Override
        public String getHeaderText() {
            return tI.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tI.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}