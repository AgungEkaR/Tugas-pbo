public class Main{
    public static void main(String[] args){
        Ticket economy = new EconomyTicket("person1", 20);
        Ticket business = new BusinessTicket("person2", 30);
        Ticket first = new FirstTicket("person3", 40);
       
        System.out.println("Economy Ticket:");
        economy.displayTicketInfo();
       
        System.out.println("\nBusiness Ticket:");
        business.displayTicketInfo();
       
        System.out.println("\nFirst Ticket:");
        first.displayTicketInfo();
    }
}
