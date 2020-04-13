package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String obj = "";
        //String url="http://gamensnsobj.ns/delta/index.html?obj=stringObj11&name=Amigo";//
        String url = readUrl();
        obj=parseUrl(url);
            //System.out.println("obj: "+obj);
        if(obj!="") {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static String readUrl() {
        String url = null;
        try {
            url = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String parseUrl(String url){
        char[]urlArray = url.toCharArray();
        ArrayList<String>paramArray=new ArrayList<>();

        String param = "";
        String obj = "";
        boolean print = false;
        boolean objB = false;
        for (int i=0; i<urlArray.length; i++) {

            if(urlArray[i]==63){//?
                i++;
                print=true;
            }
            if(urlArray[i]==38){//&
                if (objB==true){
                    obj=param;
                    objB=false;
                    param="";
                }
                if(param!=""){
                    System.out.print(param+" ");
                    param="";
                }
                i++;
                print=true;
            }
            if(urlArray[i]==61){//=
                if(param.equals("obj")){
                    objB=true;
                    print=true;
                    System.out.print(param+" ");
                    param="";
                    continue;
                }

                System.out.print(param+" ");
                param="";
                print=false;
            }
            if(print)param += urlArray[i];
        }
        System.out.print("\n");
        return obj;
    }
}

/*            if(urlArray[i]==63){param = "";i++;
            }else if(urlArray[i]==38)
             {
                i++;
                if (param !="") {
                    System.out.println(param);
                }
                param = "";
            }
            param += (char)urlArray[i];
            }
        System.out.println(param);
*/
