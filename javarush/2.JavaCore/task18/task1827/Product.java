package com.javarush.task.task18.task1827;

public class Product {
    private int id; //8
    private String productName; //30
    private float price; //8
    private int quantity; //4

        public int getId () {
        return id;
    }

        public void setId ( int id){
        this.id = id;
    }

        public String getProductName () {
        return productName;
    }

        public void setProductName (String productName){
        this.productName = productName;
    }

        public float getPrice () {
        return price;
    }

        public void setPrice ( float price){
        this.price = price;
    }

        public int getQuantity () {
        return quantity;
    }

        public void setQuantity ( int quantity){
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
