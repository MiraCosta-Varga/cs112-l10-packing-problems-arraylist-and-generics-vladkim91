import java.util.Scanner;

class Main {

  /* MAIN -
  *   
  *   This is the driver class for our user interface in the 
  *   console. However, it is set up in a way that it uses
  *   our Transfer class exclusively to access our list info.
  *
  *   You should not have to change anything here. Transfer
  *   and Inventory is where you will be everything you need
  *   to do.
  */

  
  public static void main(String[] args) {
    
    Transfer transfer = new Transfer();
    Scanner keyboard = new Scanner(System.in);
    boolean exit = false;

    while(exit == false) {
      
      displayMainMenu();
      int mainMenuChoice = keyboard.nextInt();
      System.out.println("\nMain Menu Choice: " + mainMenuChoice);

      // Main Menu Choice 1 
      if(mainMenuChoice == 1) {
        System.out.println("You Chose: View Lists");
        transfer.printLists();
        continue;
      } // End of Main Menu Choice 1
      

      // Main Menu Choice 2
      else if(mainMenuChoice == 2) {
        System.out.println("You Chose: Edit Lists");
        displayEditMenu();

        int editMenuChoice = keyboard.nextInt();
        System.out.println("\nEdit Menu Choice: " + editMenuChoice);

        if(editMenuChoice == 1) {
            System.out.println("You Chose: Food List\n");
            displayActionMenu();

            int actionChoice = keyboard.nextInt();
            System.out.println("\nAction Choice: " + actionChoice);

            if(actionChoice == 1) { // Add Food
              System.out.println("You Chose: Add to List\n");
              transfer.addItems(editMenuChoice);

            } else if(actionChoice == 2) { // Edit Food Qty
              System.out.println("You Chose: Edit Quantity\n");
              transfer.editQuantity(editMenuChoice);

            } else if(actionChoice == 3) { // Remove Food
              System.out.println("You Chose: Remove from List\n");
              transfer.removeItems(editMenuChoice);
              

            } else if(actionChoice == 4) {
                exitDisplay();
                //exit = true;
                break;

            } else {
                System.out.println("\nPlease select a valid option.\n");
                continue;

            } // End of Edit Menu Choice 1


        } else if(editMenuChoice == 2) {
            System.out.println("You Chose: Parts List\n");
            displayActionMenu();

            int actionChoice = keyboard.nextInt();
            System.out.println("\nAction Choice: " + actionChoice);

            if(actionChoice == 1) { // Add Parts
              System.out.println("You Chose: Add to List\n");
              transfer.addItems(editMenuChoice);

            } else if(actionChoice == 2) { // Edit Parts Qty
              System.out.println("You Chose: Edit Quantity\n");
              transfer.editQuantity(editMenuChoice);

            } else if(actionChoice == 3) { // Remove Parts
              System.out.println("You Chose: Remove from List\n");
              transfer.removeItems(editMenuChoice);

            } else if(actionChoice == 4) {
                exitDisplay();
               // exit = true;
                break;

            } else {
                System.out.println("\nPlease select a valid option.\n");
                continue;
            } // End of Edit Menu Choice 2



        } else if(editMenuChoice == 3) {
            System.out.println("You Chose: Supplies List\n");
            displayActionMenu();

            int actionChoice = keyboard.nextInt();
            System.out.println("\nAction Choice: " + actionChoice);

            if(actionChoice == 1) { // Add Supplies
              System.out.println("You Chose: Add to List\n");
              transfer.addItems(editMenuChoice);

            } else if(actionChoice == 2) { // Edit Supplies Qty
              System.out.println("You Chose: Edit Quantity\n");
              transfer.editQuantity(editMenuChoice);

            } else if(actionChoice == 3) { // Remove Supplies
              System.out.println("You Chose: Remove from List\n");
              transfer.removeItems(editMenuChoice);

            } else if(actionChoice == 4) {
                exitDisplay();
                //exit = true;
                break;

            } else {
                System.out.println("\nPlease select a valid option.\n");
                continue;
            } // End of Edit Menu Choice 3


        } else if(editMenuChoice == 4) {
            exitDisplay();
        //exit = true;
            break;

        } else {
            System.out.println("\nPlease select a valid option.\n");
            continue;
        }

      } // End of Main Menu Choice 2

      // Main Menu Choice 3
      else if(mainMenuChoice == 3){
        exitDisplay();
        break;
      } // End of Main Menu Choice 3

    } // End of While Loop
  } // End of Main method




















  // These are just display methods, no need to worry about them

  public static void displayEditMenu() {
    System.out.println("\n\nWhich list would you like to edit?");
    System.out.println("1 -- Food List");
    System.out.println("2 -- Parts List");
    System.out.println("3 -- Supplies List");
    System.out.println("4 -- Exit Program\n");
  }

  public static void displayActionMenu() {
    System.out.println("Select an action:");
    System.out.println("1 -- Add to List");
    System.out.println("2 -- Edit Quantity");
    System.out.println("3 -- Remove from List");
    System.out.println("4 -- Exit Program\n");
  }

  public static void displayMainMenu() {
    System.out.println("\n\nWelcome to the NASA Supply Depot Terminal");
    System.out.println("Select an option:");
    System.out.println("1 -- View Lists");
    System.out.println("2 -- Edit Lists");
    System.out.println("3 -- Exit Program\n");
  }

  public static void exitDisplay() { 
    System.out.println("You Chose: Exit Program");
    System.out.println("\nThank you for using the NASA Supply Depot Terminal.");
  }
}