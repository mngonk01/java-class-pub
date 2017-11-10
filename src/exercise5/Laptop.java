package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author mngonk01
 */
public class Laptop {
        private String manufacturer;
        private double price;
        private String color;
        
        public Laptop(String manufacturer, double price, String color){
                this.manufacturer = manufacturer;
                this.price = price;
                this.color = color;
}
public void setPrice(double price) {
        this.price = price;
    }
public void setColor(String color) {
        this.color = color;
    }
public String getManufacturer(){
    return manufacturer;
}
public double getPrice(){
    return price;
}
public String getColor(){
    return color;
}
@Override
public String toString() {
        return "Laptop{" + "manufacturer=" + manufacturer + ", price=" + price + ", color=" + color + '}';
    }
}
