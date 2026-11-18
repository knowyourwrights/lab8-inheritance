package tickets;

public class Main {
    public static void main(String[] args) {
        Ticket aliceTicket = new Ticket("Summer Concert", "Alice", 80);
        System.out.println(aliceTicket.toString());

        Ticket bobTicket = new StudentTicket("Summer Concert", "Bob", 80, "G00479739");
        System.out.println(bobTicket.toString());

        Ticket charlieTicket = new VIPTicket("Summer Concert", "Charlie", 80);
        System.out.println(charlieTicket.toString());

    }
}
