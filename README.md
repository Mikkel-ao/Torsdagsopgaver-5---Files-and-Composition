### Exercises with Files and composition

Today's exercises should be performed in IntelliJ. 
Create a new project for the solutions to the excercises in this set. 
For each task below, you must create a new package (same as a folder) in the project's src directory. Name it according to the task, e.g. "task1". 
In each package, create a class <code>Main.java</code> with a <code>public static void main(String[] args)</code> - method which will be used to start the program and call the methods required to complete the tasks. 

Please note, that it is unusual to have a Main class in each package, yet this is done so for the sake of the exercise.

---
## Task 1: ArrayList og objekter

1.a Lav en klasse, <code>Customer</code>, med attributterne (felterne/instansvariablene):
<code>
String firstName
String lastName
String username
int id
static int counter</code>

1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre. 

1.c Sørg for at <code>counter</code> tælles op med 1, hver gang konstruktoren bliver kaldt. Brug <code>counter</code>  til at initialisere <code>id</code>

1.d Giv klassen en <code>toString()</code> metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters og setters.

1.e Skriv en <code>Main</code> klasse med en <code>main</code>-metode, hvor der oprettes en <code>ArrayList</code>, som du kalder 'customers'.  
(Du kan oprette instanserne først, og så add'e dem til listen. Du kan også instantiere og add'e i samme linie.)

1.f Skriv en static metode i <code>Main</code> kaldet <code>printCustomers(ArrayList<Customer> customers)</code>, hvor du printer alle kunderne ud ved at gennemløbe <code>customers</code> med et for each loop. Test metoden fra <code>main</code> ved at kalde den med din <code>ArrayList</code> som argument.


## Task 2: Load coffee menu for a cafe
In this program we will load a list of coffee names and display it to the user. We will create a <code>Cafe</code> class which loads the list and a <code>Main</code> class which tests that the <code>Cafe</code> class is working as expected.

2.a In this repository you will find a file called coffees.txt. Open it and check that is contains 5 names for types of coffee. Download it or copy the text to a new text file and save it with the same name coffee.txt. Remember to save it in the root of your project and not in the src folder with the .java files. 

2.b Create a class called <code>Main</code> with a <code>main</code>-method. 

2.c Create another class called <code>Cafe</code>. Give it an attribute called <code>coffeeMenu</code> of type <code>ArrayList\<String\></code> (later you will fill this <code>ArrayList</code> with the names of the coffees from the textfile). Make the attribute private and write a getter-method that returns the list. 

2.c In the <code>Cafe</code> class add a method <code>loadMenuData()</code>.
In the method make a <code>File</code>-object representing the coffees.txt file like this:
<p><code>File file = new File("coffees.txt") </code>  </p>
(make sure that the path is right)

2.d In this step you will read from the file, using a Scanner object: Add the <code>File</code> instance to a new Scanner object. (This piece of code will need to be wrapped in a <code>try -catch</code> block)

The solution to this step is given below, but give it a go before peeping.
<details>
  <summary>Sneak peek</summary>
  <code>try {
          File file = new File("coffees.txt");
          Scanner scan = new Scanner(file); 
        } catch(FileNotFoundException e){
          System.out.println("File not found. Check path and filename");  
        }
</code>
</details>

2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:

Use a while loop with the <code>hasNextLine()</code> and <code>nextLine()</code> -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
<details>
  <summary>Sneak peek
  </summary>
<code>
while(scan.hasNextLine()){
  coffeeMenu.add(scan.nextLine());
}  
</code>      
</details>

2.g In the <code>main</code>-method create a new instance of the <code>Cafe</code> class and call it's <code>loadMenuData()</code> -method.

2.h Still in the <code>main</code>-method, print all the elements in the list <code>coffeeMenu</code> from the <code>Cafe</code> instance you just created.
<details>
  <summary>Hint</summary>
  Use the getter-method from the <code>Cafe</code> class to retrieve the list of coffees. Then use a for loop to iterate through the list and and print the names of the coffees one by one. 
</details>



---
## Task 3: Buildings and Rooms
This task is an excercise in accessing fields in objects within objects. You will create a building with some rooms. Each room will have some attributes which you will access (read the value of) in order to determine how many windows and lamps are in the building.

The diagram below shows the attributes and method signatures referred to in steps 3.a t 3.f.
![image](https://github.com/user-attachments/assets/031a1ee1-4f2d-4510-b212-3f052434a597)


3.a Create a class <code>Room</code> with the following attributes/fields (use appropriate types and make them private): 
- numberOfLamps
- numberOfWindows

3.b Create a constructor that populates (assigns values to) all the fields.

3.c As the fields of <code>Room</code> are private, create getter- and setter-methods for them. 

3.d Create a class <code>Building</code> with the following fields (use appropriate types and make them private):
- rooms 
   <details>
        <summary>
          Hint  
        </summary>
        This should be a datatype that can hold multiple objects of type <code>Room</code>.
    </details>   
- numberOfFloors

3.e Create a constructor that populates all the fields. 

3.f As the fields of <code>Building</code> are private, create getters and setters for them.
    
3.g Create a class <code>Main</code> with a <code>main</code>-method. In your <code>main</code>-method, instantiate at least three different rooms. 

3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your class <code>Building</code>).

3.i In your <code>main</code>-method, instantiate a new building with the rooms you created in 3.h.

3.j Create a static method in <code>Main</code> called <code>countLampsInBuilding()</code> that takes an object of type <code>Building</code> and returns the total number of lamps in the entire building. 
 <details>
        <summary>
           Hint
        </summary>
         You will need to create a loop that looks at each room in the building and adds the number of lamps in each room to a variable.
</details>

Create methods <code>countWindowsInBuilding()</code> and <code>countRoomsInBuilding()</code>. Test in <code>main</code> that your methods work as expected. If not, debug your program. 

3.k create another static method in <code>Main</code> called <code>isNormal()</code> that takes an object of type <code>Building</code> as argument. The method should return true if the building's number of floors is greater than or equal to it's number of rooms. If not it should return false. Test this method from your <code>main</code> using both a normal and a anormal building. 

---


