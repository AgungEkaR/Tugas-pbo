public class BusinessTicket extends Ticket{
    public BusinessTicket(String passengerName, double baseFare){
        super(passengerName, baseFare);
    }
   
    @Override
    public double calculateFare(){
        return baseFare * 1.2;
    }
}