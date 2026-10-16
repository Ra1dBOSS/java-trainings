package org.example.products;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhysicalProductTest {

  @Test
  void physicalProductShouldCalculate20PercentTax() {
    ProductType laptop = new PhysicalProduct("Ноутбук", 1000.0, "ул. Ленина, 1");

    double tax = laptop.calculateTax();

    assertEquals(200.0, tax, 0.001, "Налог для физического товара должен быть 20%");
  }

  @Test
  void equalsAndHashCodeShouldWorkForRecords() {
    var p1 = new PhysicalProduct("Айфон", 999.0, "Минск");
    var p2 = new PhysicalProduct("Айфон", 999.0, "Минск");
    var p3 = new PhysicalProduct("Xiaomi", 999.0, "Минск");

    assertEquals(p1, p2);
    assertEquals(p1.hashCode(), p2.hashCode());
    assertNotEquals(p1, p3);
    assertNotEquals(p1.hashCode(), p3.hashCode());
  }
}