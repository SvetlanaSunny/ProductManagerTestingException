package ru.netology;

public class Product {
 protected int id;
 protected String title;
 protected int price;

 public Product(int id, String title, int price){
   this.id = id;
   this.title = title;
   this.price = price;
 }

  public int getId() {
    return id;
  }
  public String getName(){
   return title;
  }

  public boolean matches(String search){
   return getName().contains(search);
 }
}
