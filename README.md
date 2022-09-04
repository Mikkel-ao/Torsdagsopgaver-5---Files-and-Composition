### Exercises with Scanner and Files


## Task 1. Textbased menu
1.a In a new project create an entity class, Menu and a client class, Main with a main method.

1.b In the main method create an ArrayList of type String called 'options' with the following values:
"1. Start game"
"2. Resume game"
"3. Pause game"
"4. End game"

1.c Still in the main method, instantiate the Menu class passing the 'options' reference as an argument to the constructor.

1.d Add a constructor to the Menu class that matches the instantiation made in 1.c. The Menu class must have a private attribute of the same type as the parameter passed in the constructor. Assign the passed options ArrayList to the private options ArrayList (hint: this.options = options).

1.e Create a method in the Menu class, <code>showMenu</code> that prints the sentence "Choose an options by typing the number associated" followed by each individual option on its own line. (Hint: use a for-each loop). 
 1.e.1 The method should return a value of type int, with the user's choice. (Hint: int choice = scanner.nextInt()). This should only happen if the choice is valid.
 1.e.2 Additionally the method should print a message to the user if the choice is invalid (ie. greater than the number of options). 

1.e.1 In the main method call the showMenu method on the Menu instance, saving the return value (the user response) in a variable. Pass this variable as you call another method in the Main class, <code>doAction</code>, which you will write next.


1.g Create a method, doAction in the Main class, that accepts a value of type int as argument. This value represents the user choice of option. In the body of the method write a switch-case where:
case 1 will print "Starting the game now"
case 2 will print "Fetching previously saved game data"
case 3 will print "Game paused"
case 4 will print "Ending game"


## Task 2: Finish the GuessANumber class
2.a open the java file above called GuessANumber.java and try to finish the code. Follow the steps written as comments in the makeAGuess method.

## Task 3: load options
 
3.a Start a new textfile with the exact text given here:
"Expresso", "Americano" , "Macchiato", "Flat White",  "Latte"
Save it as a menu.csv file and placed it in the same folder as Cafe.java

3.a Create a class called Cafe with a main method. In the global scope of this class add an ArrayList of type String called 'menu'.

3.c Add a method  <code>loadMenuData</code> to the class with the parameter 'filename' of type String. 
  Have the method load the file, add it to a Scanner object.

3.d Use the split method to convert the data into a String array.(hint: scanner.nextLine().split())
  This will return a String array. Loop over the returned String Array and for each element create a new String with the value of the element preceeded by an number: For the element "Expresso" there will be a new String with the value "1. Expresso". 
  Then add the new String to the menu ArrayList which you created in step 3.a

3.d Reuse the Menu class from Task 1. (just copy it into the folder of the Cafe.java). Create a new instance of the Menu class, with the cafe options as argument. Call the showMenu method on the Menu object. Remember the method will return the user's choice? Print the name of the coffee that corresponds to the user's choice. 


## Task 4: write to file
