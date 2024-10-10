import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Cafe {
    // 2.c
    private ArrayList<String> coffeeMenu = new ArrayList<>();


    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // 2.c part 2, class
    public void loadMenuData() {
        // 2.d
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);
            // 2.e
            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}
