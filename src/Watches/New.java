package Watches;

public class New {
public int quantity, price;
public String brand;

public static int id=0;

public int getId() {
return id++;
}

String getBrand() {
return brand;
}

int getQuantity() {
return quantity;
}

int getPrice() {
return price;
}

public void setBrand(String brand) {
this.brand = brand;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public void setPrice(int price) {
this.price = price;
}


public New(String brand, int price, int quantity) {

setBrand(brand);
setQuantity(quantity);
setPrice(price);



}


}