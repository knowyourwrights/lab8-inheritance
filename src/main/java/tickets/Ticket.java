package tickets;

public class Ticket {
    private String eventName;
    private String holderName;
    private double basePrice;
    //constructors
    public Ticket(String eventName, String holderName, double basePrice)
    {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public Ticket() {
        this.eventName = "";
        this.holderName = "";
        this.basePrice = 0;
    }
    //getters & setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice()
    {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Event: " + getEventName() + '\n' +
                "Holder: " + getHolderName() + '\n' +
                "Price: " + calculatePrice() + '\n';
    }
}
