import java.util.ArrayList;

public class Lot {
    private String description;
    private ArrayList<Bid> bids;

    public Lot(String description) {
        this.description = description;
        bids = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void addBid(Bid bid) {
        bids.add(bid);
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }
}
