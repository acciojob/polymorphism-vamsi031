package com.driver;

public class Main {
    public static class Product{
        public int Product(int x,int y){
            return x*y;
        }
        public int Product(int x,int y,int z){
            return x*y*z;
        }
        public double Product(double x,double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product P = new Product();
        P.Product(1,2);
        P.Product(1,2,3);
        P.Product(2.05,3.02);
    }

}