package Project2;

public class Task3 {
    /*
    Task 3: Create a Class Car that would have the following
fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price
of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class   has   field   as   weight   and   has   its   own
implementation   of
  calculateSalePrice()   method   in
which   returned   price   calculated   as   following:   if
weight>2000 then returned price car should include
10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it
is   own   implementation   of   calculateSalePrice():   if
length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
     */
    private int carPrice;
    private String carColor;

    public Task3(int carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    public double getSalePrice() {
        return carPrice;
    }
}
class Sedan extends Task3{
    int length;

    public Sedan(int carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length=length;
    }

    public double getSalePrice() {
        return super.getSalePrice()*(length > 20 ? 0.9 : 0.85);
    }
}
class Truck extends Task3{
    private int weight;

    public Truck(int carPrice, String carColor, int weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }

    public double getSalePrice() {
        return super.getSalePrice()*(weight<2000 ? 0.85 : 0.75);
    }
}