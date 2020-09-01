package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static{
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter (IncomeData data){
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            ArrayList<Character> phoneNumberOutArray = new ArrayList<Character>();
            phoneNumberOutArray.add('+');
            for (char countryPhoneCodeChar : Integer.toString(data.getCountryPhoneCode()).toCharArray()) {
                phoneNumberOutArray.add(countryPhoneCodeChar);
            }

            phoneNumberOutArray.add('(');

            char[]phoneNumber = Integer.toString(data.getPhoneNumber()).toCharArray();
            for (int i = 0; i < 10-phoneNumber.length; i++) {
                phoneNumberOutArray.add('0');
            }
            for (char phoneNumberChar:phoneNumber) {
                phoneNumberOutArray.add(phoneNumberChar);
            }

            phoneNumberOutArray.add(phoneNumberOutArray.indexOf('(')+4,')');
            phoneNumberOutArray.add(phoneNumberOutArray.indexOf('(')+8, '-');
            phoneNumberOutArray.add(phoneNumberOutArray.indexOf('(')+11, '-');



            String phoneNumberOut = "";
            for (char countryPhoneCodeChar: phoneNumberOutArray) {
                phoneNumberOut=phoneNumberOut + countryPhoneCodeChar;
            }

            return phoneNumberOut;
        }

    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}