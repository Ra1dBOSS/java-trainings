package org.example;

import org.example.products.DigitalProduct;
import org.example.products.PhysicalProduct;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    var laptop = new PhysicalProduct("MacBook Pro 16", 3000, "Минск, Республика Беларусь");
    var ebook = new DigitalProduct("Книга «Clean Code»", 100, "https://example.com/clean-code.pdf");

    System.out.println("Товар: " + laptop);
    System.out.println("Налог (20%): " + laptop.calculateTax());

    System.out.println("Товар: " + ebook);
    System.out.println("Налог (10%): " + ebook.calculateTax());
  }
}