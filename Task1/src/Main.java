import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.e
        ArrayList customers = new ArrayList();
        Customer Hans = new Customer("Hans", "Hansen", "Hansi");
        Customer Grete = new Customer("Grete", "Gretesen", "Gertrud");
        customers.add(Hans);
        customers.add(Grete);

        // 1.f call to print
        printCustomers(customers);
    }
    // 1.f
    public static void printCustomers(ArrayList customers) {
        for (Object customer : customers) {
            System.out.println(customer);
        }
    }

}