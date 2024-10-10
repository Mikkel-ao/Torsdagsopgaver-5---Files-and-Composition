import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { //2.b
        // 2.g
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        // 2.h
        ArrayList<String> menu = cafe.getCoffeeMenu();
        System.out.println("Coffee Menu: " + menu);
    }

}