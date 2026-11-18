package tickets;

public class VIPTicket extends Ticket{

    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    public VIPTicket()
    {

    }

    @Override
    public double calculatePrice()
    {
        return getBasePrice() + 25;
    }

    public String getBenefits()
    {
        return "Priority entry and reserved seating";
    }

    @Override
    public String toString() {
        return "Event: " + getEventName() + '\n' +
                "Holder: " + getHolderName() + '\n' +
                "Price: " + calculatePrice() + '\n' +
                "Benefits: " +  getBenefits() + '\n';
    }
}
