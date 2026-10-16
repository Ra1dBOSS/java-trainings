package org.example.products;

public record PhysicalProduct(String name, double price, String shippingAddress) implements
    ProductType {

  static final double TAX_RATE = 0.2;
}
