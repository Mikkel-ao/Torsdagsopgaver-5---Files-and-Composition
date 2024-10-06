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

2.c Create another class called <code>Cafe</code>. Give it an attribute called <code>coffeeMenu</code> of type <code>ArrayList\<String\></code> (later you will fill this <code>ArrayList</code> with the names of the coffees from the textfile).

2.c In the <code>Cafe</code> class add a method <code>loadMenuData()</code>.
In the method make a <code>File</code>-object representing the coffees.txt file like this:
<p><code>File file = new File("coffees.txt") </code>  </p>
(make sure that the path is right)

2.d In this step you will read from the file, using a Scanner object: Add the <code>File</code> instance to a new Scanner object. (This piece of code will need to be wrapped in a <code>try -catch</code> block)

The solution to this step is given below, but give it a go before peeping.
<details>
  <summary>Sneak peek
  </summary>
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

2.g In the main method create a new instance of the Cafe class and call its <code>loadMenuData()</code> -method.

2.h Still in the main method, print all the elements of the  attribute <code>coffeeMenu</code> of the Cafe instance you just created.
<details>
  <summary> Hint:</summary>
  You should use a for loop, and in the body of the loop use the <code>get()</code> method of ArrayList, to get hold of the item before printing it.  
</details>



---
## Task 3: Buildings and Rooms
This task is an excercise in accessing fields in objects within objects. You will create a building with some rooms. Each room will have some attributes which you will access(read the value of) in order to draw conclusions about the building in which the rooms are placed.

The diagram below shows the attributes and method signatures refered to in steps 3.a to 3.f.
![class diagram](https://github.com/Dat1Cphbusiness/Torsdagsopgaver-5---Files-and-Composition/blob/main/doc/classdiagram.png)

3.a Create a Room.java class with the following fields (use appropriate types and make them private): 
- numberOfDoors
- numberOfLamps
- numberOfWindows

3.b Create a constructor that populates all the fields above.

3.c As the fields of the Room class are private, create getter()-methods for them, 

3.d Create a Building.java class with the following fields (use appropriate types):
- rooms 
   <details>
        <summary>
          Hint  
        </summary>
        This should be a datatype that can hold multiple objects of type Room.
    </details>

   
- numberOfBathrooms
- numberOfFloors
- isOfficeBuilding

3.e Create a constructor that populates all the fields above. 

3.f As the fields of the Building class are private, create getters() for them.
    
3.g In your main method, instantiate at least three different rooms. 

3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your Building.java class).

3.i In your main method, instantiate a new building.

3.j create a static method in Main, countLampsInBuilding, that takes an object of type Building, and returns the total number of lamps in the entire building.
 <details>
        <summary>
           Hint
        </summary>
         You will need to have a loop in the body of the method that looks at each room in the building to add the number of laps in each room.
    </details>

3.k create another static method in Main, isNormal, that takes an object of type Building. The method should return true if the Building's numberOfFloors is greater than its number of Rooms. If not it should print "This is an odd building" and return false.

---


