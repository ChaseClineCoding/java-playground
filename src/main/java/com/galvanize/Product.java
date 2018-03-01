package com.galvanize;

class Product {
    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    static class Currency {
        private Product product;

        public Currency(Product product) {
            this.product = product;
        }

        public String getUSD() {
            Float dollarAmount = product.getValueInCents() / 100f;
            return "$" + String.format("%.2f", dollarAmount);
        }
    }

    public Currency getCurrency() {
        return new Currency(this);
    }
}
