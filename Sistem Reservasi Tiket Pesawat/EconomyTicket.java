public class EconomyTicket extends Ticket{
    public EconomyTicket(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
   
    @Override
    public double calculateFare(){
        return baseFare;
    }
}