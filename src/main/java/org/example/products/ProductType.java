package org.example.products;

public sealed interface ProductType permits DigitalProduct, PhysicalProduct {

  default double calculateTax() {
    return switch (this) {
      case DigitalProduct d -> d.price() * DigitalProduct.TAX_RATE;
      case PhysicalProduct p -> p.price() * PhysicalProduct.TAX_RATE;
    };
  }
}
