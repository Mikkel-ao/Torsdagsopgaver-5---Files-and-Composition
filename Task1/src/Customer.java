public class Customer {
    // 1.a
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;


    public Customer(String firstName, String lastName, String username) {
        // 1.b
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        // 1.b
        this.id = counter++;
    }
    // 1.d
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    // 1.d getters setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
}
