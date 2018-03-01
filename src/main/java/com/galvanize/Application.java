package com.galvanize;

public class Application {

    public static void main(String[] args) {

        Product product = new Product("JIF", 3750);
        Product.Currency currency = new Product.Currency(product);
        System.out.println(currency.getUSD());

    }
}
