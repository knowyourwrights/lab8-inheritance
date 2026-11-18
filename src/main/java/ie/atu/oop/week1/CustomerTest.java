package ie.atu.oop.week1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first = new Customer("Paul", "Galway", "874358343", 2020, true);
        System.out.println(first); // will print Customer{Person{name='Paul', address='Galway', phoneNumber='874358343'}customerNumber=2020, mailingList=true}

        Customer second = new Customer();
        second.setName("Pat");
        second.setAddress("Mervue");
        second.setPhoneNumber("200000002323");
        second.setCustomerNumber(2323);
        second.setMailingList(false);
        System.out.println(second);
    }
}
