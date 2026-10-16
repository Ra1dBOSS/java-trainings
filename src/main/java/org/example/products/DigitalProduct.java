package org.example.products;

public record DigitalProduct(String name, double price, String downloadLink) implements
    ProductType {

  static final double TAX_RATE = 0.1;
}
