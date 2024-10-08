/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ticketMachine {
    private int price;    
    private int balance; 
    private int total;  

    public ticketMachine(int cost) {
        if (cost > 0) {
            price = cost;
        } else {
            System.out.println("Not a valid price");
        }
        balance = 0;
        total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotal() {
        return total;
    }
    
    public void insert(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Not a valid money");
        }
    }

    public void getTicket() {
        if (balance >= price) {
            System.out.println("A ticket would cost Rp" + price);
            total += price;
            balance -= price;
        } else {
            System.out.println("Not enough money");
            System.out.println("You must insert at least Rp" + (price - balance));
        }
    }
}
