package TaxCalculator.src;

public class InstructiaPentruCalculator {
    public double price;
    public double tax;
    public int quantity;
    public double total = 0;
    public double getPrice() {return price;}
    public double getTax() {return tax;}
    public int getQuantity () {return quantity;}
    public double getTotal() {return total;}
    public double MetodaMea (){
        total = price*quantity*tax;
        System.out.println("I want to buy " + quantity + " shirt!");
        System.out.println("Total cost with tax is: " + total); return total;
    }

}

