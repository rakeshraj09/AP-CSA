/*
Rakesh Raj
5/3/2025
tis code is to use differnet methhods of sorting
*/

public class StoreItem {
    private int Number;
    private double Price;
    private int Amount;
    private String Name;

    public StoreItem(String d, int a, double b, int c){
        Name = d;
        Number = a;
        Price = b;
        Amount = c;
    }
    public int getAmount() {
        return Amount;
    }
    public String getName() {
        return Name;
    }
    public int getNumber() {
        return Number;
    }
    public double getPrice() {
        return Price;
    }
    

    public String toString(){
        return String.format("%-20s %-8d %7.2f %7d", Name, Number, Price, Amount);
    }
}
