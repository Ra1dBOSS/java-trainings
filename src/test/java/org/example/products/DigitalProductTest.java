package org.example.products;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitalProductTest {

  @Test
  void digitalProductShouldCalculate10PercentTax() {
    ProductType ebook = new DigitalProduct("Книга PDF", 500.0, "https://example.com/book.pdf");

    double tax = ebook.calculateTax();

    assertEquals(50.0, tax, 0.001, "Налог для цифрового товара должен быть 10%");
  }

  @Test
  void equalsAndHashCodeShouldWorkForRecords() {
    var p1 = new DigitalProduct("OSLicense", 999.0, "link");
    var p2 = new DigitalProduct("OSLicense", 999.0, "link");
    var p3 = new DigitalProduct("OSLicense", 1001.0, "link2");

    assertEquals(p1, p2);
    assertEquals(p1.hashCode(), p2.hashCode());
    assertNotEquals(p1, p3);
    assertNotEquals(p1.hashCode(), p3.hashCode());
  }
}