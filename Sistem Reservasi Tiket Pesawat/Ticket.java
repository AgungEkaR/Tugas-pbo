public class Ticket{
    protected String passengerName;
    protected double baseFare;
   
    public Ticket(String passengerName, double baseFare){
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
   
    public double calculateFare(){
        return baseFare;
    }
   
    public void displayTicketInfo(){
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Final Fare: $" + calculateFare());
    }
}