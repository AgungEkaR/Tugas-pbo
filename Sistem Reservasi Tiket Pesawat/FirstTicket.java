public class FirstTicket extends Ticket{
    public FirstTicket(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
   
    @Override
    public double calculateFare(){
        return baseFare * 1.4;
    }
}