### Exercises with Files
Today's tasks should be coded using the IntelliJ IDE. For each Task you will create a new project, as each task will require you to create a Main class with a main method.
In some tasks you will write all the code in this main method, while in others you will be asked to make both a Main class with a main method in it (sometimes refered to as the "client class") and an "entity class" whithout a main method but with a constructor. 

---
## Task 1:
[...]

---




## Task 2: load coffee menu for a cafe
In this program we will load a list of coffee names and display it to the user. We will create a Cafe class that loads the list and a Main class that tests that the Cafe class works as expected.

2.a Above you will see a file called coffees.txt. Open it and check that is contains 5 names for types of coffee. Download it, or copy it to a new textfile and save it with the same name. Place coffees.txt in the same folder as the classes you will write for this task.

2.b Create a class called Main with a main method. 

2.c Create another class called Cafe. Give it an attribute called 'coffeeMenu' of type ArrayList\<String\>. 
(Later you will fill this ArrayList with the names of the coffees from the textfile).


2.c In the Cafe class, add a method <code>loadMenuData</code> 
Have the method load the coffees.txt file like this:
<code>File file = new File("coffees.txt) </code>  
(make sure that the path is right)


2.d In this step you will read from the file, using a Scanner object: Add the <code>file</code> instance to a new Scanner object. (This piece of code will need to be wrapped in a try -catch block)

The solution to this step is given below, but give it a go before peeping.
<details>
  <summary> The solution to this step:
  </summary>
  <code>try {

         Scanner scan = new Scanner(file); 

     }catch(FileNotFoundException e){

        System.out.println("File not found. Check path and filename");  

      }
</code>
</details>


2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:


Use a while loop with hasNextLine() on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
<details>
  <summary> peep solution:
  </summary>
<code>

  while(scan.hasNextLine()){

        coffeeMenu.add(scan.nextLine());

  }

</code>      
</details>

2.g In the main method create a new instance of the Cafe class and call its <code>loadMenuData</code> -method.

2.h Still in the main method, print all the elements of the  attribute <code>coffeeMenu</code> of the Cafe instance you just created.
<details>
  <summary> Hint:</summary>
  you should use a for loop, and in the body of the loop use the <code>get()</code> method of ArrayList, to get hold of the item before printing it.  
</details>



---
## Task 3: 
[...]

---
