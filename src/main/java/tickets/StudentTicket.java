package tickets;

public class StudentTicket extends Ticket{
    private String studentID;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentID) {
        super(eventName, holderName, basePrice);
        this.studentID = studentID;
    }

    public StudentTicket()
    {
        super();
        this.studentID = "";
    }
    //getters & setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public double calculatePrice()
    {
        return getBasePrice() * 0.8; //20% discount
    }

    @Override
    public String toString() {
        return "Event: " + getEventName() + '\n' +
                "Holder: " + getHolderName() + '\n' +
                "Price: " + calculatePrice() + '\n' +
                "Student ID: " +  studentID + '\n';
    }
}
