package com.javarush.task.task18.task1827;

public class ProductIn {
    Product product;

    public ProductIn(String[]args, Product product){
        this.product = product;
        productRecognition(args,  product);
    }

    void productRecognition(String[]args, Product product) {
        //productName harvesting
        String tmpName = "";
        for (int i = 1; i < args.length-2; i++) {
            tmpName = tmpName + args[i] +" ";
        }
        product.setProductName(tmpName);
        product.setPrice(Float.parseFloat(args[args.length-2]));
        product.setQuantity(Integer.parseInt(args[args.length-1]));

        //System.out.println(product);
    }

}
